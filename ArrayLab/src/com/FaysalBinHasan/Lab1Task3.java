package com.FaysalBinHasan;

public class Lab1Task3
{
  public static void main(String[]args)
  {
    int numbers[] ={7, 13, 2, 10, 6 };
    int even=0;
    System.out.print("Before sorting, numbers are ");
    for(int i = 0; i < numbers.length; i++)
    {
      System.out.print(numbers[i]+" ");
    }
    System.out.println();
  
    int temp;
    int i;
    for( i = 0; i < numbers.length; i++)
    {
      for( int j = 1; j < (numbers.length-i); j++)
      {
        if(numbers[j-1] < numbers[j])
        {
          temp = numbers[j-1];
          numbers[j-1]=numbers[j];
          numbers[j]=temp;
        }
      }
    }

    for( i = 0; i < numbers.length; i++)
    {
      System.out.print( numbers[i]+" ");
     }


    for( i = 0; i < numbers.length; i++)
    {
      for( int j = 1; j < (numbers.length-i); j++)
      {
        if(numbers[j-1] < numbers[j])
        {
          temp = numbers[j-1];
          numbers[j-1]=numbers[j];
          numbers[j]=temp;
        }       
      }
      if(numbers[i]%2==0){
         System.out.print(numbers[i]+" ");
      }
    }
  }
}
