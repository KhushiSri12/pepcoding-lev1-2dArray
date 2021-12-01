/*
PEPCODING LEVEL-1 2D ARRAY

SPIRAL MATRIX
*/
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[][] a=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                a[i][j]=sc.nextInt();
            }
        }
        int minr=0;
        int minc=0;
        int maxr=a.length-1;
        int maxc=a[0].length-1;
        int tne=n*m;
        int c=0;
        while(c<tne){
            for(int i=minr,j=minc;i<=maxr && c<tne;i++){
                
                System.out.println(a[i][j]);
                c++;
            }
            minc++;
            for(int i=maxr,j=minc;j<=maxc && c<tne;j++){
                
                System.out.println(a[i][j]);
                c++;
            }
            maxr--;
            for(int i=maxr,j=maxc;i>=minr && c<tne;i--){
                
                System.out.println(a[i][j]);
                c++;
            }maxc--;
            for(int i=minr,j=maxc;j>=minc && c<tne;j--){
                
                System.out.println(a[i][j]);
                c++;
            }
            minr++;
        }
    }

}
