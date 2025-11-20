package org.lessons.java;

import java.math.BigDecimal;
import java.util.Scanner;

public class Cart {
  public static void main(String[] args) {
  Scanner in = new Scanner(System.in);
  System.out.println("Seleziona smartphone(1), Televisione(2) o Cuffie(3), attraverso il numero correlato");
  int selectedProduct = in.nextInt();
  if(selectedProduct == 1){
    System.out.println("Inserisci i dati dello smartphone che desideri acquistare");
    //chiedo numero di serie
    System.out.println("Numero di serie:");
    int userSerialCode = in.nextInt();
    in.nextLine();
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
    System.out.println(cartSmartphone.toString());
  }

  if(selectedProduct == 2){
    System.out.println("Inserisci i dati della televisione che desideri acquistare");
    //chiedo numero di serie
    System.out.println("Numero di serie:");
    int userSerialCode = in.nextInt();
    in.nextLine();
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
    //chiedo base
    System.out.println("Misura base:");
    int userProductBase = in.nextInt();
    //chiedo altezza
    System.out.println("Misura altezza:");
    int userProductHeight = in.nextInt();
    //chiedo profondità
    System.out.println("Misura profondità:");
    int userProductDepth = in.nextInt();
    //chiedo se è smart o no
    System.out.println("È smart? Sì (1), No (2):");
    boolean userProductIsSmart = in.nextInt() == 1;


    Television cartTelevision = new Television(userSerialCode, userProductName, userProductBrand, userProductPrice, userProductIva, userProductBase, userProductHeight, userProductDepth, userProductIsSmart);
    System.out.println(cartTelevision.toString());
  }

  if (selectedProduct == 3) {
    System.out.println("Inserisci i dati delle cuffie che desideri acquistare");

    //chiedo numero di serie
    System.out.println("Numero di serie:");
    int userSerialCode = in.nextInt();
    in.nextLine();
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
    in.nextLine();
    //chiedo colore
    System.out.println("Colore:");
    String userProductColor = in.nextLine();
    //wireless?
    System.out.println("È wireless? Sì (1), No (2):");
    boolean userProductIsWireless = in.nextInt() == 1;

    Headset cartHeadset = new Headset(
        userSerialCode,
        userProductName,
        userProductBrand,
        userProductPrice,
        userProductIva,
        userProductColor,
        userProductIsWireless
    );

    System.out.println(cartHeadset.toString());
}
}
}
