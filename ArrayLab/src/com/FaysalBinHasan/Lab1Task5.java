package com.FaysalBinHasan;

import java.util.Scanner;
import static java.lang.System.out;
public class Lab1Task5
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    int[] array = new int[10];
    
    for (int x = 0; x < array.length; x++)
    {
      out.println("Enter number");
      array[x] = input.nextInt();
    }
    int newnum = 0;
    while (newnum <= 9)
    {
      int x = 0;
      int time = 0;
      while (x < array.length)
      {
        if (array[x] == newnum)
        {
          time++;
        }
        x++;
      }
      out.println(newnum + " exists for " + time+ " time(s)");
      newnum++;
    }
  }
}
     