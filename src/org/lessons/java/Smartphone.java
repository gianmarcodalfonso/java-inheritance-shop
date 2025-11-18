package org.lessons.java;

import java.math.BigDecimal;

public class Smartphone extends Product {
  private int imei;
  private int memory;

  // constructor
  public Smartphone(int serialCode, String name, String brand, BigDecimal price, float iva, int imei, int memory){
    super(serialCode, name, brand, price, iva);
    this.imei = imei;
    this.memory = memory;
  }

  // getter
  public int getImei(){
    return this.imei;
  }

  public int getMemory(){
    return this.memory;
  }

  // setter
  public void setImei(int newImei){
    this.imei = newImei;
  }

  public void setMemory(int newMemory){
    this.memory = newMemory;
  }
}
