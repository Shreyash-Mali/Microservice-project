package com.example.service;

import com.example.entity.Product;
import com.example.model.ProductRequest;
import com.example.model.ProductResponse;

public interface ProductService {
    public long crateProduct(ProductRequest productRequest);

   public ProductResponse getProductById(long productId);
}
