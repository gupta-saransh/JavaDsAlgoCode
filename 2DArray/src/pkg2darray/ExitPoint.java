/*
 * To change this license header, choose License Headers in Project Properties.
 * To 
change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2darray;

/**
 *
 * @author test
 */
public class ExitPoint {
    public static void main(String args[]){
    int[][] a = {{0,0,1,0},{1,0,0,1},{0,0,0,0},{1,0,1,0}};
    
    int direction=0;
    int row=0,col=0;
    while(row<a.length && col<a[0].length && row>=0 && col>=0)
    {
    direction=(direction + a[row][col])%4;
    
    if(direction==0) // east
    {
        col++;
    }else if(direction==1) //s
    {
        row++;
    }
    else if(direction==2) //west
    {
        col--;
    }
    else if(direction==3) //n
    {
        row--;
    } 
    
    
    }
    
    //Another Way Out
    
//     if(direction==0) // east
//    {
//        col--;
//    }
//    if(direction==1) //s
//    {
//        row--;
//    }
//    if(direction==2) //west
//    {
//        col++;
//    }
//    if(direction==3) //n
//    {
//        row++;
//    } 
    
    if(row>=a.length)
        row--;
    if(col>=a[0].length)
        col--;
    if(row<0)
        row++;
    if(col<0)
        col++;
    
       
    System.out.print(row +" "+ col);
    
    }
}
