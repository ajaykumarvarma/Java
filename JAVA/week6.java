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
  
  
