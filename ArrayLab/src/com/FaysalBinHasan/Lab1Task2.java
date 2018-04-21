package com.FaysalBinHasan;

import java.util.Scanner;
public class Lab1Task2
{
  public static void main(String[]args) 
  {
    Scanner k = new Scanner(System.in);
    int[]array = new int[5];
    for(int i=0;i<array.length;i++)
    {
      System.out.println("Enter A Number As Your Wish");
      array[i] = k.nextInt();
    }
    int max=0,min=0;
    for(int i=0;i<array.length;i++) 
    {
      int index = array[i];
      if(index<array[min])
      {
        min=i;
      }
       if(index>array[max]) 
      {
        max=i;
      }
    }
    int temp=array[max];
    array[max]=array[min];
    array[min]=temp;
    for(int i=0;i<array.length;i++)
    {
      System.out.print(array[i]+" ");
    }
  }
}