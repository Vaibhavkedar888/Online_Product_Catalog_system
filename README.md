Project by : Vaibhav Kedar

# Online Product Catalog

A Spring Boot web application for managing an online product catalog. This application allows users to view, search, add, edit, and delete products with a clean and intuitive user interface.

## Features

- **View Products**: Browse all products in the catalog with details like name, price, quantity, and category
- **Search Products**: Search for products by keyword
- **Add Products**: Add new products to the catalog with name, quantity, category, price, and description
- **Edit Products**: Update existing product information
- **Delete Products**: Remove products from the catalog
- **Responsive UI**: Built with Thymeleaf templates for a user-friendly experience

## Technology Stack

- **Backend**: Spring Boot 3.5.3
- **Database**: MySQL
- **ORM**: Spring Data JPA (Hibernate)
- **Template Engine**: Thymeleaf
- **Build Tool**: Maven
- **Java Version**: Java 21

## Project Structure

```
src/main/java/com/one/example/
├── OnlineProductCatalogApplication.java   # Main Spring Boot application
├── controller/
│   └── MyController.java                  # REST and Web controllers
├── entity/
│   └── Product.java                       # Product entity model
├── repository/
│   └── ProductRepository.java             # Data access layer
└── services/
    ├── ProductService.java                # Service interface
    └── ProductServiceImpl.java             # Service implementation
```

## Prerequisites

- Java 21 or higher
- MySQL 8.0 or higher
- Maven 3.8.9 or higher

## Setup & Installation

### 1. Clone the Repository
```bash
git clone <repository-url>
cd OnlineProductCatalog
```

### 2. Configure Database

Update `src/main/resources/application.properties` with your MySQL credentials:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/product_catalog
spring.datasource.username=root
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

Create the database:
```sql
CREATE DATABASE product_catalog;
```

### 3. Build the Application

Using Maven:
```bash
mvn clean install
```

Or using the provided Maven wrapper:
```bash
./mvnw clean install
```

### 4. Run the Application

```bash
mvn spring-boot:run
```

Or:
```bash
./mvnw spring-boot:run
```

The application will start on `http://localhost:8080`

## Demo Usage

### 1. Access the Home Page
Navigate to `http://localhost:8080` to see the home page.

### 2. View Product List
Click on "View Products" or navigate to `http://localhost:8080/product-list.html` to see all products in the catalog.

### 3. Search Products
On the product list page, enter a keyword in the search box and click "Search" to filter products by name or category.

### 4. Add a New Product
1. Click on "Add New Product" button
2. Fill in the product details:
   - **Product Name**: Name of the product
   - **Quantity**: Available quantity
   - **Category**: Product category (e.g., Electronics, Clothing, Books)
   - **Price**: Price of the product
   - **Description**: Detailed description
3. Click "Save" to add the product to the catalog

### 5. Edit a Product
1. On the product list, click the "Edit" button next to a product
2. Modify the product details as needed
3. Click "Save" to update the product

### 6. Delete a Product
1. On the product list, click the "Delete" button next to a product
2. Confirm the deletion when prompted
3. The product will be removed from the catalog

## Sample Product Data

Here are some example products you can add:

| Product Name | Category | Price | Quantity | Description |
|---|---|---|---|---|
| Laptop | Electronics | 899.99 | 10 | High-performance laptop for professionals |
| T-Shirt | Clothing | 19.99 | 50 | Cotton t-shirt available in multiple colors |
| Coffee Maker | Home & Kitchen | 49.99 | 15 | Automatic coffee maker with timer |
| Python Book | Books | 39.99 | 25 | Learn Python programming from basics |
| USB-C Cable | Electronics | 9.99 | 100 | 2-meter durable USB-C charging cable |

## API Endpoints

| Method | Endpoint | Description |
|---|---|---|
| GET | `/` | Home page |
| GET | `/product-list.html` | List all products (with optional keyword search) |
| GET | `/product-list.html?keyword=search` | Search products |
| GET | `/products/new` | Show add product form |
| POST | `/products/save` | Save new or updated product |
| GET | `/products/edit/{id}` | Show edit product form |
| GET | `/products/delete/{id}` | Delete a product |

## Troubleshooting

### Database Connection Error
- Ensure MySQL is running
- Verify the database URL, username, and password in `application.properties`
- Check that the database `product_catalog` exists

### Port Already in Use
If port 8080 is already in use, change it in `application.properties`:
```properties
server.port=8081
```

### Build Errors
- Ensure Java 21 is installed: `java -version`
- Clear Maven cache: `mvn clean`
- Rebuild: `mvn install`

## Development Notes

- The application uses Spring Data JPA for database operations
- Thymeleaf is used for server-side template rendering
- Bootstrap CSS framework is used for styling (can be enhanced)
- The service layer follows the Repository pattern for clean architecture

## Future Enhancements

- User authentication and authorization
- Product reviews and ratings
- Shopping cart functionality
- Payment gateway integration
- Inventory management with low stock alerts
- Product image uploads
- REST API endpoints (without UI templates)
- Unit and integration tests

## License

This project is open source and available under the MIT License.

## Contact

For questions or issues, please create an issue in the repository or contact the project maintainer.

---
