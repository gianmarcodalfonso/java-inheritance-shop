package org.lessons.java;

public class Smartphone extends Product {
  private int imei;
  private int memory;

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
