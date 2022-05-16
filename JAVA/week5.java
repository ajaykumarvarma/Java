QUESTIONS:

1. Create a class with fileds sno, sname,smarks. Set the values to these fields with
a. Default method or
b. Parameterised method or
c. Default Consrucor or
d. Parameterised constructor
Display the information using display() method
----------------------------------------------------------------------------------------
2. Create a class Employee withe fileds eno, ename, sal, city,pincode. Set the values using parameterised method. create another method to update the sal by Rs.1000. Print the information of employee before and after the update salary
----------------------------------------------------------------------------------------
3. Create a class Book with fields bno, bname, price, no_of_pages. Set the values using Parameterised constructor and then create a method to give discount of Rs. 100 and print the information before and after discount
---------------------------------------------------------------------------------------------
4. Create a class Vehicle with the fileds vno,vprice,model_name, price. Use
a. overloaded methods or
b. overloaded constructors to set values
Print the information using a show() method
-------------------------------------------------------------------------------------------
Other programs:
import java.io.*;
import java.util.*;
class Student1{
    int id;
    float salary;
    String name;
    void insert(int id,String name,float salary){
    this.id=id;
    this.name=name;
    this.salary=salary;
    
    }
    void display(){
    System.out.println("Employee id is:"+id+" Name is:"+name+" salary is:"+salary);
    }
}
class Student{
public static void main(String args[])
{
    Student1 s1=new Student1();
    Student1 s2=new Student1();
    s1.insert(122,"Ajay",256000);
    s2.insert(420,"Sai",23000);
    s1.display();
    s2.display();
}
}
-----------------------------------------------------------------------------------------------
import java.io.*;
import java.util.*;
class Student1{
    int rollno;
    String name;
    void insertrecord(int r,String n){
    rollno=r;
    name=n;
    }
    void display(){
    System.out.println("Name and rollno is:"+name+" "+rollno);
    }
}
class Student{
public static void main(String args[])
{
    Student1 s1=new Student1();
    Student1 s2=new Student1();
    s1.insertrecord(1,"Ajay");
    s2.insertrecord(2,"Sai");
    s1.display();
    s2.display();
}
}
-----------------------------------------------------------------------------------------------
import java.io.*;
import java.util.*;
class Student1{
    int length;
    int width;
    void insertrecord(int l,int w){
    length=l;
    width=w;
    }
    void display(){
    System.out.println("Area is:"+(length*width));
    }
}
class Student{
public static void main(String args[])
{
    Student1 s1=new Student1();
    Scanner sc=new Scanner(System.in);
    int l,w;
    System.out.print("Enter length and width:");
    l=sc.nextInt();
    w=sc.nextInt();
    s1.insertrecord(l,w);
    s1.display();
}
}
-----------------------------------------------------------------------------------------------
import java.io.*;
import java.util.*;
class Account{
 int acc_no;
 float amount;
 String name;
 void insert(int no,String na,float am){
 acc_no=no;
 name=na;
 amount=am;
 }
 //deposit
 void deposit(float amt){
  amount+=amt;
  System.out.println(amt+" Deposited successfully and total available balance is:"+amount);
 }
 void withdraw(float amt){
 if(amount<amt){
    System.out.println("InSufficient Funds");
   }
 else{
   amount=amount-amt;
   System.out.println(amt+" Withdrawn successfully and updated balance is:"+amount);
 }
 }
 //check balance(Balance enquiry)
 void checkbalance(){
   System.out.println("Available total balance is:"+amount);
 }
 //display person bank details
 void display(){
  System.out.println(acc_no+" "+name+" "+amount);
 }
 
}
class TestAccount{
    public static void main(String args[]){
        Account a1=new Account();
        a1.insert(40221099,"Ajay Kumar Varma",25000);
        a1.display();
        a1.checkbalance();
        a1.deposit(40000);  
        a1.checkbalance();  
	a1.withdraw(15000);  
	a1.checkbalance();
      }
}
-----------------------------------------------------------------------------------------------
Question Program 1:
//using parameterised and default methods
import java.io.*;
import java.util.*;
class Student1{
    int sno=100;
    String sname="Def name";
    float smarks=50;
    void insertrecord(int no,String name,float marks){
    sno=no;
    sname=name;
    smarks=marks;
    
    }
    void display(){
    System.out.println("sno,sname and smarks of student is:"+sno+" "+sname+" "+smarks);
    }
}
class Student{
public static void main(String args[])
{
    Student1 s1=new Student1();
    Student1 s2=new Student1();
    //parameterised method lets use s1
    s1.insertrecord(100,"sai",96);
    s1.display();
    //default method lets use s2
    s2.display();
}
}
-----------------------------------------------------------------------------------------------
//default and parameterised constructor
import java.io.*;
import java.util.*;
class Student1{
    int sno;
    String sname;
    float smarks;
    public Student1(int no,String name,float marks){
    sno=no;
    sname=name;
    smarks=marks;
    
    }
    public Student1(){
    sno=0;
    sname="pushpa";
    smarks=0;
    
    }
    void display(){
    System.out.println("sno,sname and smarks of student is:"+sno+" "+sname+" "+smarks);
    }
}
class Student{
public static void main(String args[])
{
    Student1 s1=new Student1(2000,"Ajay",93);//parameterised constructor
    Student1 s2=new Student1();//default constructor
    s1.display();
    s2.display();
}
}
-----------------------------------------------------------------------------------------------
