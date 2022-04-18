1) Menu driven calculator program

import java.io.*;
import java.util.*;
import java.lang.*;
public class Main {

   
    public static void main(String args[])
   {
      Scanner sc=new Scanner(System.in);
      int x,y,choice,answer;
      
      while(true)
      {
      System.out.println("Choose one option from below:");
      System.out.println("1.Addition");
      System.out.println("2.Subtraction");
      System.out.println("3.Multiplication");
      System.out.println("4.Division");
      System.out.println("5.Exit");
          System.out.print("Enter your Choice:"); 
          choice=sc.nextInt();
          switch(choice)
              {
                    case 1:
                       System.out.println("Enter Two Numbers for Addition:");
                       System.out.print("Enter First Number:");
                       x=sc.nextInt();
                       
                       System.out.print("Enter Second Number:");
                       y=sc.nextInt();
                       answer=x+y;
                       System.out.println("Sum is:"+answer);
                       break;
                    case 2:
                       System.out.println("Enter Two Numbers for Subtraction:");
                       System.out.print("Enter First Number:");
                       x=sc.nextInt();
                       
                       System.out.print("Enter Second Number:");
                       y=sc.nextInt();
                       answer=x-y;
                       System.out.println("Difference is:"+answer);
                       break;
                    case 3:
                       System.out.println("Enter Two Numbers for Multiplication:");
                       System.out.print("Enter First Number:");
                       x=sc.nextInt();
                       
                       System.out.print("Enter Second Number:");
                       y=sc.nextInt();
                       answer=x*y;
                       System.out.println("Product is:"+answer);  
                       break;
                    case 4:
                       System.out.println("Enter Two Numbers for Subtraction:");
                       System.out.print("Enter First Number:");
                       x=sc.nextInt();
                       
                       System.out.print("Enter Second Number:");
                       y=sc.nextInt();
                       answer=x/y;
                       System.out.println("Division is:"+answer);     
                       break;
                    case 5:
                        System.exit(0);
                        
                    default:
                        System.out.println("Enter a valid Option"); 
                        
            } }}}

-----------------------------------------------------------------------------------------------------------------------------
2) Reversing a number in Java
  
import java.io.*;
import java.util.*;
import java.lang.*;
public class Main {

   
    public static void main(String args[])
   {
      Scanner sc=new Scanner(System.in);
      int n,rev=0,rem,temp;
      System.out.println("Enter a number for reversing:");
      n=sc.nextInt();
      temp=n;
      while(n!=0){
      rem=n%10;
      rev=(rev*10)+rem;
      n=n/10;
      
      }
      System.out.println("Reverse is:"+rev);
      
    }
    
}

---------------------------------------------------------------------------------------------------------
3) Amstrong Number
 
import java.io.*;
import java.util.*;
import java.lang.*;
public class Main {

   
    public static void main(String args[])
   {
      Scanner sc=new Scanner(System.in);
      int n,r,sum=0,temp;
      System.out.print("Enter a number:");
      n=sc.nextInt();
      temp=n;
      while(n!=0){
      r=n%10;
      sum=sum+r*r*r;
      n=n/10;
      
      }
      if(temp==sum){
      System.out.println("Its a Amstrong Number")
      }
      else{
      System.out.println("Not An Amstrong Number");
      }
    }
    
}

-----------------------------------------------------------------------------------
4) Biggest and Smallest digit a given multiple digit number

import java.io.*;
import java.util.*;
public class Main {

   
    public static void main(String args[])
   {
      Scanner sc=new Scanner(System.in);
      int n,r;
      System.out.print("Enter a number:");
      n=sc.nextInt();
      int min=9;
      int max=0;
      while(n>0){
      r=n%10;
      if(r>max){
      max=r;
      }
      if(r<min)
      {
      min=r;
      }
      n=n/10;
      }
      System.out.println("Biggest digit is:"+max);
      System.out.println("Smallest digit is:"+min);
    }
    
}

----------------------------------------------------------------------------------------------------
5) Perfect Number

import java.io.*;
import java.util.*;
public class Main {

   
    public static void main(String args[])
   {
      Scanner sc=new Scanner(System.in);
      int n;
      System.out.print("Enter a number:");
      n=sc.nextInt();
      int temp=n;
      int sum=0;
      for(int i=1;i<n;i++){
      int rem=n%i;
      if (rem==0){
      sum=sum+i;
      }
      }
      if(sum==temp){
      System.out.println(sum+" is an Perfect Number");
      }
      else{
      System.out.println(temp+" is not an perfect number");
      }
      
    }
    
}

------------------------------------------------------------------------------
6) Strong Number

import java.io.*;
import java.util.*;
public class Main {

   
    public static void main(String args[])
   {
      Scanner sc=new Scanner(System.in);
      int n;
      System.out.print("Enter a number:");
      n=sc.nextInt();
      int temp=n;
      int sum=0;
      
      while(n!=0){
      int rem=n%10;
      int fact=1;
      for(int i=1;i<=rem;i++){
      fact=fact*i;
      }
      n=n/10;
      sum=sum+fact;
      }
      if(sum==temp){
          System.out.println(sum+" is Strong number");
      }
      else{
          System.out.println(temp+" is not Strong number");
      
      }
      
    }
    
}

------------------------------------------------------------------------------------------------------
7) Program to print all armstrong numbers between 1 to 100

   
   
   
   
  
