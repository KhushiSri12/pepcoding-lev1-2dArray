/*
PEPCODING LEVEL-1 2D ARRAYS 

SEARCH IN A 2D SORTED ARRAY 
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
        int x=sc.nextInt();
        int i=0;
        int j =a.length-1;
        while(i<a.length &&j>=0){
            if(x==a[i][j]){
                System.out.println(i);
                System.out.println(j);
                return;
            }
            else if(x<a[i][j]){
                j--;
            }
            else{
                i++;
            }
        }
        System.out.println("Not Found");
    }

}