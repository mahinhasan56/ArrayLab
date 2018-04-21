package com.FaysalBinHasan;

import java.util.Scanner;
public class Lab1Task1{
  public static void main(String[]args){
    Scanner k=new Scanner (System.in);
    System.out.println("Enter The length Of An Array");
    int size=k.nextInt();
    int a[]=new int[size];
    
    for(int i=0;i<a.length;i++){
      System.out.println("Give Your chiceeable number");
      a[i]=k.nextInt();
      if(a[size-1]== 6 || a[0] == 6){
        System.out.println("true");
      }
    }
  }
}