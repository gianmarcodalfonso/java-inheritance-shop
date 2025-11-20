package org.lessons.java;

import java.math.BigDecimal;
import java.util.Scanner;

public class Cart {
  public static void main(String[] args) {
  Scanner in = new Scanner(System.in);
  System.out.println("Seleziona smartphone(1), Televisione(2) o Cuffie(3), attraverso il numero correlato");
  int selectedProduct = in.nextInt();
  if(selectedProduct == 1){
    System.out.println("Inserisci i dati del prodotto che desideri acquistare");
    //chiedo numero di serie
    System.out.println("Numero di serie:");
    int userSerialCode = in.nextInt();
    //chiedo nome del prodotto
    System.out.println("Nome:");
    String userProductName = in.nextLine();
    //chiedo brand del prodotto
    System.out.println("Brand:");
    String userProductBrand = in.nextLine();
    //chiedo prezzo
    System.out.println("Prezzo:");
    BigDecimal userProductPrice = in.nextBigDecimal();
    //chiedo iva
    System.out.println("Iva:");
    float userProductIva = in.nextFloat();
    //chiedo imei
    System.out.println("Imei:");
    int userProductImei = in.nextInt();
    //chiedo memoria
    System.out.println("Memoria:");
    int userProductMemory = in.nextInt();


    Smartphone cartSmartphone = new Smartphone(userSerialCode, userProductName, userProductBrand, userProductPrice, userProductIva, userProductImei, userProductMemory);
    
  }
}
}
