//Check two matrices are equal or not
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
       int i,j;
       System.out.println("Enter First Matrix elements:");
       for(i=0;i<r1;i++)
     {
       for(j=0;j<c1;j++)
       {
          m1[i][j]=sc.nextInt();
       }
       
     }
       System.out.println("Enter Second Matrix elements:");
       for(i=0;i<r2;i++){
       for(j=0;j<c2;j++){
          m2[i][j]=sc.nextInt();
       }
       }
            int flag=0; 
            for(i=0;i<r1;i++)
              {
               for(j=0;j<c2;j++)
               {  
                 if(m1[i][j]!=m2[i][j]){
                     
                    flag=0; 
                 }
                 else{
                    flag=flag+1; 
                    }
                 }
               }
            if(flag==1){
            System.out.println("Two matrices are not equal");
            }
            else{
            System.out.println("Two matrices are equal");
            }
    }
}
-----------------------------------------------------------------------------------
//UPPER AND LOWER TRIANGULAR MATRIX
import java.io.*;
import java.util.*;
import java.lang.*;
public class Main{
public static void main(String args[])
   {
       Scanner sc=new Scanner(System.in);
       System.out.print("Enter Matrix No Of Rows:");
       int r=sc.nextInt();
       System.out.print("Enter Matrix No Of Columns:");
       int c=sc.nextInt();
       int m[][]=new int[r][c];
       
       int i,j;
       System.out.println("Enter Matrix elements:");
       for(i=0;i<r;i++)
      {
       for(j=0;j<c;j++)
       {
          m[i][j]=sc.nextInt();
       }
       }
       System.out.println("Lower triangular matrix is:");
       for(i=0;i<r;i++){
           System.out.println();
        for(j=0;j<c;j++){
          if(i>=j){
          System.out.print(m[i][j]);
          System.out.print(" ");
          }
          else{
          System.out.print("0");
          System.out.print(" ");
          }
        }
       }
       System.out.println();
       System.out.println("Upper triangular matrix is:");
       for(i=0;i<r;i++){
           System.out.println();
        for(j=0;j<c;j++){
          if(i>j){
          System.out.print("0");
          System.out.print(" ");
          }
          else{
          System.out.print(m[i][j]);
          System.out.print(" ");
          }
        }
       }
       System.out.println();
    }
}     
---------------------------------------------------------------------------------   
// Transpose of a matrix
import java.io.*;
import java.util.*;
import java.lang.*;
public class Main{
public static void main(String args[])
   {
       Scanner sc=new Scanner(System.in);
       System.out.print("Enter Matrix No Of Rows:");
       int r=sc.nextInt();
       System.out.print("Enter Matrix No Of Columns:");
       int c=sc.nextInt();
       int m[][]=new int[r][c];
       
       int i,j;
       System.out.println("Enter Matrix elements:");
       for(i=0;i<r;i++)
      {
       for(j=0;j<c;j++)
       {
          m[i][j]=sc.nextInt();
       }
       }
      //Transposing
      System.out.println("Original Matrix is:");
      for(i=0;i<r;i++)
      {    
        for(j=0;j<c;j++)
        {    
        System.out.print(m[i][j]+" ");    
        }    
        System.out.println();   
      }
      System.out.println("Transposed Matrix is:");
      for(i=0;i<r;i++)
      {    
        for(j=0;j<c;j++)
        {    
        System.out.print(m[j][i]+" ");    
        }    
        System.out.println();   
      }
    }
}     
--------------------------------------------------------------------------
//Java Program to find the frequency of odd & even numbers in the given matrix
import java.io.*;
import java.util.*;
import java.lang.*;
public class Main{
public static void main(String args[])
   {
       Scanner sc=new Scanner(System.in);
       System.out.print("Enter Matrix No Of Rows:");
       int r=sc.nextInt();
       System.out.print("Enter Matrix No Of Columns:");
       int c=sc.nextInt();
       int m[][]=new int[r][c];
       
       int i,j,even=0,odd=0;
       System.out.println("Enter Matrix elements:");
       for(i=0;i<r;i++)
      {
       for(j=0;j<c;j++)
       {
          m[i][j]=sc.nextInt();
       }}
      for(i=0;i<r;i++)
      {    
        for(j=0;j<c;j++)
        {    
          if(m[i][j]%2==0){
          even+=1;
          }
          else{
          odd+=1;
          }
        } }
      System.out.println("Even elements frequency is:"+even);
      System.out.println("Odd elements frequency is:"+odd);
    }
}     
------------------------------------------------------------------------------
//Java Program to find the sum of each row and each column of a matrix
import java.io.*;
import java.util.*;
import java.lang.*;
public class Main{
public static void main(String args[])
   {
       Scanner sc=new Scanner(System.in);
       System.out.print("Enter Matrix No Of Rows:");
       int r=sc.nextInt();
       System.out.print("Enter Matrix No Of Columns:");
       int c=sc.nextInt();
       int m[][]=new int[r][c];
       
       int i,j,rsum=0,csum=0;
       int i1,j1;
       System.out.println("Enter Matrix elements:");
       for(i=0;i<r;i++)
      {
       for(j=0;j<c;j++)
       {
          m[i][j]=sc.nextInt();
       }}
      for(i=0;i<r;i++)
     {
       rsum=0;
      for(j=0;j<c;j++){
       rsum+=m[i][j];
      }
      System.out.println("Sum of row"+(i+1)+" is:"+rsum);
      
      }
      System.out.println();
      for(i1=0;i1<c;i1++)
     {
         csum=0;
      for(j1=0;j1<r;j1++){
       csum+=m[j1][i1];
      }
      System.out.println("Sum of column"+(i1+1)+" is:"+csum);
      }
     }
}     
--------------------------------------------------------------------------------
#Sparse Matrix or not using java
import java.io.*;
import java.util.*;
import java.lang.*;
public class Main{
public static void main(String args[])
   {
       Scanner sc=new Scanner(System.in);
       System.out.print("Enter Matrix No Of Rows:");
       int r=sc.nextInt();
       System.out.print("Enter Matrix No Of Columns:");
       int c=sc.nextInt();
       int m[][]=new int[r][c];
       
       int i,j;
       System.out.println("Enter Matrix elements:");
       for(i=0;i<r;i++)
      {
       for(j=0;j<c;j++)
       {
          m[i][j]=sc.nextInt();
       }
       }
       int div;
       div=(r*c)/2;
       int count=0;
       for(i=0;i<r;i++)
      {
       for(j=0;j<c;j++)
       {
          if(m[i][j]==0){
          count=count+1;
           
          }
       }
       }
       if(count>div){
       System.out.println("Sparse Matrix");
       }
       else{
             System.out.println("Not a Sparse Matrix");
       }
               
    }
}     
-------------------------------------------------------------------------

