package com.petstore.petstore.dto;

import java.util.UUID;

public class Product {

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public int getQuantity() {
    return quantity;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }

  public boolean isLowInvernory() {
    return lowInvernory;
  }

  public void setLowInvernory(boolean lowInvernory) {
    this.lowInvernory = lowInvernory;
  }

  private String name;

  private String description;

  private int quantity;

  private boolean lowInvernory;
}
