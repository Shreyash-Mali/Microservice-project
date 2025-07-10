package com.example.service;

import com.example.Exception.ProductServiceCustomException;
import com.example.entity.Product;
import com.example.model.ProductRequest;
import com.example.model.ProductResponse;
import com.example.repository.ProductRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {

    private static final Logger log = LoggerFactory.getLogger(ProductServiceImpl.class);

    @Autowired
    private ProductRepository productRepository;

    @Override
    public long crateProduct(ProductRequest productRequest) {
        log.info("Creating product: {}", productRequest);

        Product product = new Product();
        product.setProductName(productRequest.getProductName());
        product.setPrice(productRequest.getPrice());
        product.setQuantity(productRequest.getQuantity());
        product = productRepository.save(product);

        log.info("Saved product to repository: {}", product);

        return product.getId();
    }

    @Override
    public ProductResponse getProductById(long productId) {
    log.info("Fetching product by ID: {}", productId);
    Product product= productRepository.findById(productId).orElseThrow(()-> new ProductServiceCustomException("Product with id not fount","PRODUCT_NOT_FOUND"));
        ProductResponse productResponse = new ProductResponse();
        productResponse.setProductName(product.getProductName());
        productResponse.setProductId(product.getId());
        productResponse.setPrice(product.getPrice());
        productResponse.setQuantity(product.getQuantity());
        log.info("Fetched product: {}", productResponse);
        return productResponse;
    }
}
