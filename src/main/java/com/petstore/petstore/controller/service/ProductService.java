package com.petstore.petstore.controller.service;

import java.util.List;

import com.petstore.petstore.dto.Product;

public interface ProductService {

  List<Product> getProucts();
  void saveProduct(Product product);
}
