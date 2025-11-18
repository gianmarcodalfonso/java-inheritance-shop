package org.lessons.java;

import java.math.BigDecimal;

public class Headset extends Product{
  private String color;
  private boolean isWireless;

  // constructor
  public Headset(int serialCode, String name, String brand, BigDecimal price, float iva, String color, boolean isWireless){
    super(serialCode, name, brand, price, iva);
    this.color = color;
    this.isWireless = isWireless;
  }

  // getter
  public String getColor(){
    return this.color;
  } 

  public boolean getIsWireless(){
    return this.isWireless;
  }

  // setter
  public void setColor(String newColor){
    this.color = newColor;
  }

  public void setIsWireless(boolean newIsWireless){
    this.isWireless = newIsWireless;
  }
}
