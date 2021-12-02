/*
PEPCODING LEVEL-1 2D ARRAYS 


RING ROTATE
*/
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int [][] arr=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        int s=sc.nextInt();
        int r=sc.nextInt();
        
        rotateshell(arr,s,r);
        display(arr);
        
    }
    
    
    public static void rotateshell(int[][] arr,int s,int r){
    int[] oned=fillOneFromShell(arr,s);
    rotate(oned,r);
    fillShellFromOne(arr,s,oned);
    }
    
    
    
    public static int[] fillOneFromShell(int[][] arr,int s){
        int minr=s-1;
        int minc=s-1;
        int maxr=arr.length-s;
        int maxc=arr[0].length-s;
        int sz=2*(maxr-minr+maxc-minc);
        int[] oned=new int[sz];
        int ind=0;
        
        
        
        for(int i=minr,j=minc;i<=maxr;i++){
            oned[ind]=arr[i][j];
            ind++;
        }
        
        
        
        for(int i=maxr,j=minc+1;j<=maxr;j++){
            oned[ind]=arr[i][j];
            ind++;
        }
        
        
        for(int i=maxr-1,j=minc;i>=minr;i--){
            oned[ind]=arr[i][j];
            ind++;
        }
        
        
        
        for(int i=maxr,j=maxc-1;j>=minc;j--){
            oned[ind]=arr[i][j];
            ind++;
        } 
        
        return oned;
    }
    
    
    public static void fillShellFromOne(int[][] arr,int s,int[] oned){
        int minr=s-1;
        int minc=s-1;
        int maxr=arr.length-s;
        int maxc=arr[0].length-s;
        int ind=0;
        
        
        
        for(int i=minr,j=minc;i<=maxr;i++){
            arr[i][j]=oned[ind];
            ind++;
        }
        
        
        
        for(int i=maxr,j=minc+1;j<=maxr;j++){
            arr[i][j]=oned[ind];
            ind++;
        }
        
        
        for(int i=maxr-1,j=minc;i>=minr;i--){
            arr[i][j]=oned[ind];
            ind++;
        }
        
        
        
        for(int i=maxr,j=maxc-1;j>=minc;j--){
            arr[i][j]=oned[ind];
            ind++;
        } 
    }
        
    
    
    
    public static void rotate(int[] oned,int r){
        r=r%oned.length;
        if(r<0){
            r=r+oned.length;
        }
        
        reverse(oned,0,oned.length-r-1);
        reverse(oned,oned.length-r,oned.length-1);
        reverse(oned,0,oned.length-1);
    }
    
    public static void reverse(int[] oned ,int li,int ri){
        while(li<ri){
            int temp=oned[li];
            oned[li]=oned[ri];
            oned[ri]=temp;
            
            li++;
            ri--;
        }

    }
    

    public static void display(int[][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

}