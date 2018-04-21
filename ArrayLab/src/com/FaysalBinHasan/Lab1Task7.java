package com.FaysalBinHasan;

import java.util.Scanner;
public class Lab1Task7
{
  public static void main(String[]args)
  {
    Scanner k=new Scanner(System.in);
    int[] array=new int[4];
    int i;
    //5,6,7,9//2
    for( i=0;i<array.length;i++)
    {
      System.out.println("Enter various Number As Your Wish");
      array[i]=k.nextInt();
    }
    System.out.println("Enter an index As Your wish");
    int c=k.nextInt();
    if(c<array.length||c>0)
    {
      for(int j=0;j<array[c];j++){
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
