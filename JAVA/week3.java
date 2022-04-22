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
  
  
