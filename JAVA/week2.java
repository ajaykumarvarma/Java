Menu driven calculator program

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
  
  Reversing a number in Java
  
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
   
   
  
