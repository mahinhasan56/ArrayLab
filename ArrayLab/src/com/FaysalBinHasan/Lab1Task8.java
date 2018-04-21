package com.FaysalBinHasan;

import java.util.Scanner;
public class Lab1Task8
{
   public static void main(String args[])
   {
      int a,b,p,q;
      int sum=0,c,d,k;
      Scanner sc= new Scanner(System.in);
      System.out.println("Enter the number of rows and columns for 1st matrix");
      a=sc.nextInt();
      b=sc.nextInt();
      int array[][] = new int[a][b];
      System.out.println("Enter the elements of first matrix");
      for(c=0;c<a;c++)
         for(d=0;d<b;d++)
            array[c][d] = sc.nextInt();
      System.out.println("Enter the number of rows and columns for matrix 2");
      p=sc.nextInt();
      q=sc.nextInt();
      if (b!=p)
      {
         System.out.println("is not possible.");
      }
      else
      {
         int doublearr1[][] = new int[p][q];
         int doublearr2[][] = new int[a][q];
         System.out.println("Enter the elements of second matrix");
         for(c=0;c<p;c++)
         {
            for(d=0;d<q;d++)
            {
               doublearr1[c][d] = sc.nextInt();
            }
         }
         for(c=0;c<a;c++)
         {
            for(d=0;d<q;d++)
            {   
               for(k=0;k<p;k++)
               {
                  sum=sum+doublearr1[k][d]*array[c][k];
               }
               doublearr2[c][d] = sum;
               sum=0;
            }
         }
         System.out.println(" matrices product:-"); 
         for(c=0;c<a;c++)
         {
            for(d=0;d<q;d++)
               System.out.print(doublearr2[c][d]+"\t");
            System.out.print("\n");
         }
      }
   }
}