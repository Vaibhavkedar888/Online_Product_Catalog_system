package com.one.example.controller;


import com.one.example.entity.Product;
import com.one.example.services.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class MyController {

    private final ProductService productService;

    public MyController(ProductService productService) {
        this.productService = productService;
    }
    
    @GetMapping("/product-list.html")
    public String listProducts(Model model, @RequestParam(value = "keyword", required = false) String keyword) {
        List<Product> products;
        if (keyword != null && !keyword.trim().isEmpty()) {
            products = productService.searchProducts(keyword);
        } else {
            products = productService.getAllProducts();
        }
        model.addAttribute("products", products);
        model.addAttribute("keyword", keyword); 
        return "product-list"; 
    }

    @GetMapping("/products/new")
    public String showAddProductForm(Model model) {
        Product product = new Product();
        model.addAttribute("product", product);
        model.addAttribute("pageTitle", "Add New Product");
        return "product-form";
    }

 
    @PostMapping("/products/save")
    public String saveProduct(@ModelAttribute("product") Product product) {
        productService.saveProduct(product);
        return "redirect:/"; 
    }
  
    @GetMapping("/products/edit/{id}")
    public String showEditProductForm(@PathVariable("id") Long id, Model model) {
        Product product = productService.getProductById(id);
        if (product == null) {
            return "redirect:/";
        }
        model.addAttribute("product", product);
        model.addAttribute("pageTitle", "Edit Product (ID: " + id + ")");
        return "product-form"; 
    }

    @GetMapping("/products/delete/{id}")
    public String deleteProduct(@PathVariable("id") Long id) {
        productService.deleteProductById(id);
        return "redirect:/"; 
    }
}