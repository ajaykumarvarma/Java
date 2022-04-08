1) ADDITION

import java.io.*;
class addition
{
public static void main(String args[])
{
int a,b;
a=10;
b=20;
System.out.println("Sum is:"+(a+b));
}
}

--------------------------------------------------------
2)CALCULATOR OPERATIONS

import java.io.*;
import java.util.Scanner;
class calculator
{
 public static void main(String args[])
{
int x,y,add,sub,mul,div;
Scanner sc = new Scanner(System.in);  
System.out.print("Enter the first number:");  
x = sc.nextInt();
System.out.print("Enter the second number:");  
y = sc.nextInt();    
add=x+y;
sub=x-y;
mul=x*y;
div=x/y;
System.out.println("Sum is:"+add);
System.out.println("Difference is:"+sub);
System.out.println("Product is:"+mul);
System.out.println("Division is:"+div);

}

}
------------------------------------------------------------
3)SUBTRACTION

import java.io.*;
import java.util.Scanner;
class subtraction
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.print("Enter first number:");
int a=s.nextInt();
System.out.print("Enter second number:");
int b=s.nextInt();
int c=a-b;
System.out.println("Difference is:"+c);
}
}

--------------------------------------------------------------
  
