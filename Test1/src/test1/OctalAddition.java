/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test1;
import java.util.*;
/**
 *
 * @author test
 */
public class OctalAddition {
    
    
    public static void main(String args[]){
    Scanner scn = new Scanner(System.in);
    System.out.println("Enter First Number");
    int num1=scn.nextInt();
    System.out.println("Enter Second Number");
    int num2=scn.nextInt();
    int carry=0,rem1=0,rem2=0,rem3=0,sum=0,pow=1,Csum=0;
  while(num1!=0 && num2!=0)
   {
    rem1=num1%10;
    num1=num1/10;
    
    rem2=num2%10;
    num2=num2/10;
    rem3=rem1+rem2+carry;
    Csum=(rem3%8);
    sum+=Csum*pow;
    carry=rem3/8;
    pow=pow*10;
   }
  sum=carry*pow+sum;
    System.out.println(sum);
    
    }
    
}
