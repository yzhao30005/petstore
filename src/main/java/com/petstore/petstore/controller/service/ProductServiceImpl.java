package com.petstore.petstore.controller.service;

import java.util.List;

import com.petstore.petstore.controller.repository.ProductRepository;
import com.petstore.petstore.model.Product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {

  @Autowired
  private ProductRepository productRepository;

  @Override
  public List<com.petstore.petstore.dto.Product> getProucts() {
    var list = productRepository.findAll();
 
    return list.stream().map(this::toProductDto).toList();
  }

  @Override
  public void saveProduct(com.petstore.petstore.dto.Product product) {
    productRepository.save(toProduct(product));
  }

  private com.petstore.petstore.dto.Product toProductDto(Product product) {
    com.petstore.petstore.dto.Product newProduct = new com.petstore.petstore.dto.Product();
    newProduct.setName(product.getName());
    newProduct.setDescription(product.getDescription());
    newProduct.setQuantity(product.getQuantity());
    return newProduct;
  }

  private Product toProduct(com.petstore.petstore.dto.Product product) {
    Product newProduct = new Product();
    newProduct.setName(product.getName());
    newProduct.setDescription(product.getDescription());
    newProduct.setQuantity(product.getQuantity());
    return newProduct;
  }
}
