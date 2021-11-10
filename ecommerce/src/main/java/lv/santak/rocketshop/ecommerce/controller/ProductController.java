package lv.santak.rocketshop.ecommerce.controller;

import lv.santak.rocketshop.ecommerce.repository.Product;
import lv.santak.rocketshop.ecommerce.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

    @RestController
    @RequestMapping("/api/products")
    public class ProductController {

        // productService constructor injection
        @Autowired
        ProductService productService;

        @GetMapping(value = { "", "/" })
        Iterable<Product> getProducts() {
            return productService.getAllProducts();
        }
    }

