package org.lessons.java;

public class Headset {
  private String color;
  private boolean isWireless;

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
