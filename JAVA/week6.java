#Programs on inheritance

1.Create a class A with the variables x,y. Create a method to set the date to x and y. Create a subclass B with the variable z. create a method to set the data to z. Write a method to display the information.
Program:
----------
import java.io.*;
import java.util.*;
class A{
int x,y;
 void set(int x,int y){
 this.x=x;
 this.y=y;
 }
  void display1(){
 System.out.println("Inside parent class");
 System.out.println("The values of x and y are:"+x+" "+y);
 }
}
class B extends A {
    int z;
    void setdata(int z){
      this.z=z;
    }
     void display2(){
 System.out.println("Inside child class");        
 System.out.println("The values of z is:"+z);
 }
}
public class inheritance{
    
    public static void main(String args[]){
        int a,b,c;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter x value:");
        a=sc.nextInt();
        System.out.print("Enter y value:");
        b=sc.nextInt();
        System.out.print("Enter z value:");
        c=sc.nextInt();
        B objb=new B();
        objb.set(a,b);
        objb.display1();
        objb.setdata(c);
        objb.display2();
    }
}
------------------------------------------------------------------------------------------------------------  
 2.	Create a class Q with a variable q and consider default constructor for setting to q. Create a subclass R with a variable r and consider default constructor for setting to r. Create a subclass to R as S with a variable s and consider a default constructor for setting for s. Create a display function in each of the classes. Create a main method to call the functions

 import java.io.*;
import java.util.*;
class Q
{
    int q;
    public Q()
    {
        q=10;  
    }
    void display1()
    {
        System.out.println("The value of q is: "+q);
    }
}
class R extends Q
{
    int r;
    public R()
    {
        r=20;  
    }
    void display2()
    {
        System.out.println("The value of r is: "+r);
    }
}
class S extends R
{
    int s;
    public S()
    {
        s=30;  
    }
    void display3()
    {
        System.out.println("The value of s is: "+s);
    }
}
public class inheritance
{
    
    public static void main(String args[])
    {
       S s1=new S();
       s1.display1();
       s1.display2();
       s1.display3();
       
    }
}
------------------------------------------------------------------------------------------------------------ 
