package org.lessons.java;

import java.math.BigDecimal;

public class Television extends Product{
  private int base;
  private int height;
  private int depth;
  private boolean isSmart;

  // constructor
  public Television(int serialCode, String name, String brand, BigDecimal price, float iva, int base, int height, int depth, boolean isSmart){
    super(serialCode, name, brand, price, iva);
    this.base = base;
    this.height = height;
    this.depth = depth;
    this.isSmart = isSmart;
  }

  // getter
  public int getBase(){
    return this.base;
  }
  
  public int getHeight(){
    return this.height;
  }
  
  public int getdepth(){
    return this.depth;
  }

  public boolean getIsSmart(){
    return this.isSmart;
  }

  // setter
  public void setBase(int newBase){
    this.base = newBase;
  }
  
  public void setHeight(int newHeight){
    this.height = newHeight;
  }
  
  public void setDepth(int newDepth){
    this.depth = newDepth;
  }

  public void setIsSmart(boolean newIsSmart){
    this.isSmart = newIsSmart;
  }

  @Override
public String toString() {
    return String.format(
        "TV - Codice: %d, Nome: %s, Brand: %s, Prezzo: %.2f€, IVA: %.2f%%, Dimensioni: %dx%dx%d cm, Smart: %s",
        this.serialCode, this.name, this.brand, this.price.doubleValue(), this.iva,
        this.base, this.height, this.depth,
        this.isSmart ? "Sì" : "No"
    );
}
}
