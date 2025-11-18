package org.lessons.java;

import java.math.BigDecimal;

public class Product {
  private int serialCode;
  private String name;
  private String brand;
  private BigDecimal price;
  private float iva;


  // getter
  public int getSerialCode(){
    return this.serialCode;
  }

  public String getName(){
    return this.name;
  }

  public String getBrand(){
    return this.brand;
  }

  public BigDecimal getPrice(){
    return this.price;
  }

  public float getIva(){
    return this.iva;
  }

  // setter
  public void setName(String newName){
    this.name = newName;
  }

  public void setBrand(String newBrand){
    this.brand = newBrand;
  }
  
  public void setPrice(BigDecimal newPrice){
    this.price = newPrice;
  }
  
  public void setIva(float newIva){
    this.iva = newIva;
  }
  
}
