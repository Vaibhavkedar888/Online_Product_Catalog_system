package com.one.example.services;

import com.one.example.entity.Product;

import java.util.List;

public interface ProductService {
    List<Product> getAllProducts();
    Product getProductById(Long id);
    Product saveProduct(Product product);
    void deleteProductById(Long id);
    List<Product> searchProducts(String keyword);
}
