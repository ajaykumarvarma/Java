//Single Dimensional array in java

import java.io.*;
import java.util.*;
import java.lang.*;
public class Main {

   
    public static void main(String args[])
   {
      int a[]={10,20,30,40,50};
      System.out.println("Given array elemtents are:");
      for(int i=0;i<5;i++){
      System.out.println(a[i]);
      }
   }
}
-------------------------------------------------------------------
//Program to print even and odd elements seperately from given array

import java.io.*;
import java.util.*;
public class Main {

   
    public static void main(String args[])
   {
      Scanner sc=new Scanner(System.in);
      int a[]=new int[5];
      int e[]=new int[5];
      int o[]=new int[5];
      int n1=0,n2=0;
      int n;
      System.out.print("Enter length of array:");
      n=sc.nextInt();
      for(int i=0;i<n;i++)
      {
      a[i]=sc.nextInt();
      if(a[i]%2==0){
      e[n1]=a[i];
      n1++;
      }
      else{
      o[n2]=a[i];
      n2++;
      }
      
      }
      System.out.println("Elements of even array are:");
      for(int j=0;j<e.length;j++){
      if(e[j]!=0)  {  
       System.out.println(e[j]+" ");
      }
      }
      System.out.println("Elements of odd array are:");
      for(int k=0;k<o.length;k++){
          if(o[k]!=0){
       System.out.println(o[k]+" ");}
      }
    }
}

---------------------------------------------------------------------------
//3x3 unit matrix
import java.io.*;
import java.util.*;
public class Main {

   
   public static void main(String args[])
   {
       int a[][]=new int[3][3];
       System.out.println("3x3 Unit Matrix is:");
       for(int i=1;i<=3;i++){
       for(int j=1;j<=3;j++){
        if(i==j){
        System.out.print(1+" ");
        }
        else{
        System.out.print(0+" ");
        }
       }
       System.out.println(" ");
       }
   }
}
------------------------------------------------------------
//Sum of 2 matrices
import java.io.*;
import java.util.*;
public class Main {

   
   public static void main(String args[])
   {
       Scanner sc=new Scanner(System.in);
       int m1[][]=new int[3][3];
       int m2[][]=new int[3][3];
       int m3[][]=new int[3][3];
       int i,j,k;
       System.out.println("Enter First Matrix elements:");
       for(i=0;i<3;i++){
       for(j=0;j<3;j++){
          m1[i][j]=sc.nextInt();
       }
       }
       System.out.println("Enter Second Matrix elements:");
       for(i=0;i<03;i++){
       for(j=0;j<03;j++){
          m2[i][j]=sc.nextInt();
       }
       }
       for(i=0;i<3;i++){
       for(j=0;j<3;j++){
          m3[i][j]=m1[i][j]+m2[i][j];
       }
       }
       System.out.println("Sum Of Two Matrices Is:");
       for(i=0;i<3;i++){
       for(j=0;j<3;j++){
          System.out.print(m3[i][j]+" ");
       }
       System.out.println(" ");
       }
    }
}
-------------------------------------------------------------------
//Matrix Multiplication In Java
import java.io.*;
import java.util.*;
public class Main {

   
   public static void main(String args[])
   {
       Scanner sc=new Scanner(System.in);
       System.out.print("Enter First Matrix No Of Rows:");
       int r1=sc.nextInt();
       System.out.print("Enter First Matrix No Of Columns:");
       int c1=sc.nextInt();
       System.out.print("Enter Second Matrix No Of Rows:");
       int r2=sc.nextInt();
       System.out.print("Enter Second Matrix No Of Columns:");
       int c2=sc.nextInt();
       int m1[][]=new int[r1][c1];
       int m2[][]=new int[r2][c2];
       int m3[][]=new int[r1][c2]; 
                  
       int i,j,k;
       
       if(r1==c2){
              System.out.println("Enter First Matrix elements:");
       for(i=0;i<r1;i++){
       for(j=0;j<c1;j++){
          m1[i][j]=sc.nextInt();
       }
       }
       System.out.println("Enter Second Matrix elements:");
       for(i=0;i<r2;i++){
       for(j=0;j<c2;j++){
          m2[i][j]=sc.nextInt();
       }
       }
             System.out.println("Resultant Matrix Multiplication is:");
              for(i=0;i<r1;i++)
              {
               for(j=0;j<c2;j++)
               {  
                  m3[i][j]=0;
                  for(k=0;k<c1;k++)
                  {
                      m3[i][j]+=m1[i][k]*m2[k][j];
                  }   
                  System.out.print(m3[i][j]+" ");
               }  
               System.out.println();
              }
       }
       else{
           System.out.println("Matrix Multiplication with size you gave is not possible !");
       }  
   }
}

-------------------------------------------------------------------
   
   
  
