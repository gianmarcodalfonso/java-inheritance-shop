package org.lessons.java;

public class Television extends Product{
  private int base;
  private int height;
  private int depth;
  private boolean isSmart;

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

}
