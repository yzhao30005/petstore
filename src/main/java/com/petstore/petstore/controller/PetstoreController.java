package com.petstore.petstore.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.petstore.petstore.controller.service.ProductService;
import com.petstore.petstore.dto.Product;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping(PetstoreController.BASE_URL)
public class PetstoreController {
  public static final String BASE_URL = "/v1/store";

  @Autowired
  private ProductService productService;

  @GetMapping
  public List<Product> getProducts() {
    var response = productService.getProucts();
    return response;
  }

  @PostMapping
  public ResponseEntity<Void> saveProducts(@RequestBody Product product) {
    productService.saveProduct(product);
    return ResponseEntity.noContent().build();
  }
}
