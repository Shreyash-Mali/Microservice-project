package com.example.controller;

import com.example.entity.Product;
import com.example.model.ProductRequest;
import com.example.model.ProductResponse;
import com.example.repository.ProductRepository;
import com.example.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService productService;
    @PostMapping
    public ResponseEntity<?> createProduct(@RequestBody ProductRequest productRequest){
        long productId = productService.crateProduct(productRequest);
        return new ResponseEntity<>(productId, HttpStatus.CREATED);
    }
    @GetMapping("/{id}")
    public ResponseEntity<ProductResponse> getProductById(@PathVariable long id) {
        ProductResponse productResponse = productService.getProductById(id);
        return new ResponseEntity<>( productResponse,HttpStatus.OK);
    }

}
