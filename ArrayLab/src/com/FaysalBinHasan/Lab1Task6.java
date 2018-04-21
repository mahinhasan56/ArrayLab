package com.FaysalBinHasan;

import java.util.Scanner;
public class Lab1Task6{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);      
        int[] array = {35724, 42624};    
        for(int a=0;a<array.length;a++)
        {
          System.out.println(met(array[a]));
        }
    }
    public static boolean met(int x){
        if(x == method(x))
        {
          return true;
        }
        return false;
    }   
    public static int method(int number){
        int m = 0;  
        while(number!=0){
          m=m*10+number%10;
          number=number/10;
        }    
        return m;
    }
}

//output:false
//true
