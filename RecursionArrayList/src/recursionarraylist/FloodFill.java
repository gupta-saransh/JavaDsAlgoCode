/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursionarraylist;

/**
 *
 * @author test
 */
public class FloodFill {
    static int br[][] = new int[5][6];
    
    public static void ff(int[][] arr,int cr, int cc,String psf)
    {
        int dr=arr.length-1;
        int dc=arr[0].length-1;
        int sc=0;
        int sr=0;
        
        if(arr[cr][cc]==1)
            return;
        
        if(cr==dr && cc==dc)
        { System.out.println(psf);
        return;
        }
  
       

        arr[cr][cc]=1;
    if(cr<dr)
    {
        //arr[cr][cc]=1;
    ff(arr,cr+1,cc,psf+"D");
    //arr[cr][cc]=0;
    
    }
     if(cc<dc)
    {
        // arr[cr][cc]=1;
    ff(arr,cr,cc+1,psf+"R");
    //arr[cr][cc]=0;
    
   
    }
      if(cr>sr)
    {
         //arr[cr][cc]=1;
    ff(arr,cr-1,cc,psf+"T");
    //arr[cr][cc]=0;
   
    }
      if(cc>sc)
    {
        // arr[cr][cc]=1;
    ff(arr,cr,cc-1,psf+"L");
   // arr[cr][cc]=0;
   
    }
    
     arr[cr][cc]=0; 
    
    }
    public static void main(String args[])
    {
        
        int arr[][] = {{0,1,0,0,0,0},{0,1,0,1,1,0},{0,0,0,0,0,0},{0,1,0,1,1,0},{0,1,0,0,0,0}};
        ff(arr,0,0,"");
                     
    }
    
}
