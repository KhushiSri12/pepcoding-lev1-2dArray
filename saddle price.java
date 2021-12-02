/*
PEPCODING LEVEL-1 2D ARRAYS 

SADDLE PRICE
*/

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[][] a=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                a[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<a.length;i++){
            int svj=0;
        
            for(int j=1;j<a.length;j++){
                if(a[i][j]<a[i][svj]){
                    svj=j;
                    
                }
            }
        
        boolean flag=true;
        for(int k=0;k<a.length;k++){
        if(a[k][svj]>a[i][svj]){
            flag=false;
            break;
        }
        }
        if(flag==true){
            System.out.println(a[i][svj]);
            return;
        }
        }
        
        System.out.println("Invalid input");
        
       
           
        
    }
}
