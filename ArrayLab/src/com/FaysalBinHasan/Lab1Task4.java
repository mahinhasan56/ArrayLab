package com.FaysalBinHasan;

import java.util.Scanner;
public class Lab1Task4
{
  public static void main(String[]args)
  {
    Scanner k=new Scanner(System.in);
    int array[]=new int[5];
    for(int i=0;i<array.length;i++)
    {
      System.out.println("Please enter a number");
      array[i]=k.nextInt();
    }
    System.out.println("Please enter another number");
    int newnum,x,i;
    newnum=k.nextInt();
    for(i=0,x=0;i<array.length;i++)
    {
      if(newnum==array[i])
      {
        System.out.println(newnum+" " + " is already in among the entered numbers" +" \nEnter a new num" );
      }
      else
      {
        x=x+1;
      }
    }
    if(x==array.length)
    {
      System.out.println(" all numbers are different");
    }
  }
}