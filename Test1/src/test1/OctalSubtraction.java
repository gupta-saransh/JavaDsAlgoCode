/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test1;

import java.util.Scanner;

/**
 *
 * @author test
 */
public class OctalSubtraction {
    
    public static void main(String args[]){
    Scanner scn = new Scanner(System.in);
    System.out.println("Enter First Number");
    int num1=scn.nextInt();
    System.out.println("Enter Second Number");
    int num2=scn.nextInt();
    int borrow=0,rem1=0,rem2=0,pow=1,num=0,sub=0;
  while(num1!=0 && num2!=0)
   {
    rem1=num1%10;
    num1=num1/10;
    rem2=num2%10;
    num2=num2/10;
    rem1=rem1-borrow;
    if(rem1>=rem2)
    {
    num=rem1-rem2;
    borrow=0;
    sub+=num*pow;
    }else
    {
    num=(rem1+8)-rem2;
    borrow=1;
    sub+=num*pow;
    }
    pow=pow*10;
   }
    System.out.println(sub);
    } 
}

