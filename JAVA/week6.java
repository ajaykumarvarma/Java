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
 2.Create a class Q with a variable q and consider default constructor for setting to q. Create a subclass R with a variable r and consider default constructor for setting to r. Create a subclass to R as S with a variable s and consider a default constructor for setting for s. Create a display function in each of the classes. Create a main method to call the functions

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
3.Create a class person with the filed firstname, lastname. Use parameterized method to set the values to the variables at runtime. Create sub class Employee with the variable eno, edept, esal. Create parameterized method for setting the data and default method for display the information.

import java.io.*;
import java.util.*;
class Person
{
    String a;
    String b;
    Person(String fname,String lname)
    {
        a=fname;
        b=lname;
    }
    
}
class Employeee  extends Person

{
    int eno;
    String edept;
    float esal;
    Employeee(String fname,String lname,int eno,String edept,float esal)
    {
       super(fname,lname); 
       this.eno=eno;
       this.edept=edept;
       this.esal=esal;
       
    }        
    void display()
    {
        System.out.println("The Fname and Lname of person are: "+a+" "+b);
        System.out.println("The eno,edept and esal of Employee are:"+eno+" "+edept+" "+esal);
    }
}

public class inheritance
{
    
    public static void main(String args[])
    {
       Employeee e=new Employeee("Nagaraju","Ajay Kumar Varma",1003451,"IT",80000);
       e.display();
       
    }
}
-------------------------------------------------------------------------------------------------------------------- 
4.Modify the above program by creating a subclass of Employee called Department with the variables dno, dname, experience. Set parameterized method for setting the data and display all the information
import java.io.*;
import java.util.*;
class Person
{
    String a;
    String b;
    Person(String fname,String lname)
    {
        a=fname;
        b=lname;
    }
    
}
class Employeee  extends Person

{
    int eno;
    String edept;
    float esal;
    Employeee(String fname,String lname,int eno,String edept,float esal)
    {
        super(fname,lname);
        this.eno=eno;
        this.edept=edept;
        this.esal=esal;
       
    }        
   
}
class Department  extends Employeee

{
    int dno;
    String dname;
    int dexp;
    Department(String fname,String lname,int eno,String edept,float esal,int dno,String dname,int dexp)
    {
       super(fname,lname,eno,edept,esal);
       this.dno=dno;
       this.dname=dname;
       this.dexp=dexp;
       
    }        
    void display()
    {
        System.out.println("The Fname and Lname of person are: "+a+" "+b);
        System.out.println("The eno,edept and esal of Employee are:"+eno+" "+edept+" "+esal);
        System.out.println("The dno,dname and dexp are: "+dno+" "+dname+" "+dexp);
    }
}

public class inheritance
{
    
    public static void main(String args[])
    {
      Department d=new Department("Ajay","Kumar",1003495,"IT",95000,10,"IT",4);
      d.display();
    }
}
-------------------------------------------------------------------------------------------------------------
5.Create a class named Employee with the following details
 Data members:
(a)	name (b) address (c) age (d) gender
Methods :
	(a ) Display () to show the employee details
Create another class FullTimeEmployee that inherits the Employee class :
	Data members :
(a)	Salary	Designation
Method :
(a)	Display () to show the salary and designation along  with other employee details.
Create another class PartTimeEmployee that inherits the Employee class :
	Data members :
(a)	Workinghours	rateperhour
Methods :
(a)	caluculatepay() to caluculate the amount payable
(b)	display() to show the amount payable along with the employee details.
Create objects of these classes and call their methods .use appropriate constructors.
-------------
import java.io.*;
import java.util.*;
class Employeee{
    String name,address,gender;
    int age;
    Employeee(String name,String address,int age,String gender)
    {
        this.name = name;
        this.address = address;
        this.age = age;
        this.gender = gender;
    }
    void display1()
    {
        System.out.println(name);
        System.out.println(address);
        System.out.println(age);
        System.out.println(gender);
    }
}
class FullTimeEmployee extends Employeee{
    String designation;
    float salary;
    FullTimeEmployee(String name,String address,int age,String gender,String designation,float salary)
    {
        super(name,address,age,gender);
        this.designation = designation;
        this.salary = salary;
    }
    void display2()
    {
        System.out.println(name);
        System.out.println(address);
        System.out.println(age);
        System.out.println(gender);
        System.out.println(designation);
        System.out.println(salary);

    }
}
class PartTimeEmployee extends Employeee
{
    int workhours;
    float rateperhr;
    float totalpay;
    PartTimeEmployee(String name,String address,int age,String gender,int workhours,float rateperhr)
    {
        super(name,address,age,gender);
        this.workhours=workhours;
        this.rateperhr=rateperhr;
    }
    void calculatepay()
    {
        totalpay=workhours*rateperhr;
    }
    void displaypay()
    {
        System.out.println("The total amount to pay forEmployee is :"+totalpay);
    }
   
}


public class inheritance
{
    
    public static void main(String args[])
    {
      FullTimeEmployee f=new FullTimeEmployee("Ajay","Vijayawada",19,"Male","SDE",100000);
      f.display2();
      PartTimeEmployee p=new PartTimeEmployee("Ajay","Vijayawada",19,"Male",8,300);
      p.calculatepay();
      p.displaypay();
    }
}
------------------------------------------------------------------------------------------------------------- 
6.Create a class Employer with company_name and city. Create a parameterised method companyDetails(String, String) to set the values to the two variables.  Create a showCompanyDetails() method to display the company information.
Create a subclass Employee with eno,ename,esal. Create a parameterized constructor to set the values to these variables. create a showEmployee() to display the information.
Create a main method to test the classes

import java.io.*;
import java.util.*;
class Employer{
    String company_name,city;
    void p1(String company_name,String city)
    {
        this.company_name = company_name;
        this.city = city;
    }
    void showCompanyDetails()
    {
        System.out.println("company info:");
        System.out.println(company_name);
        System.out.println(city);
    }
}
class Employee2 extends Employer{
    int eno;
    String ename;
    float esal;
    void p2(int eno,String ename,float esal)
    {
        this.eno  =eno;
        this.ename = ename;
        this.esal = esal;
    }
    void showEmployee()
    {
        System.out.println("employee info:");
        System.out.println(eno);
        System.out.println(ename);    
        System.out.println(esal);        

    }
}

public class inheritance
{
    
    public static void main(String args[])
    {
      Employee2 e = new Employee2();
        e.p1("WELLS FARGO","HYDERABAD");
        e.showCompanyDetails();
        e.p2(3549093,"AJAY",90000);
        e.showEmployee();
    }
}
------------------------------------------------------------------------------------------------------------------
7.Create a base class called person  
with SSN  and name as data types with getdata and display as member functions. Derive a  new class called student with rollno, branch,mark1,mark2,mark3 as datamembers and getdata and display  as member functions and finally derive a new  class called grade from student class in that calculate the average for marks and display the  grade for the  student 
            a. A grade >=90%
            b. B grade>=80%
            c. C grade>=70%
d. Less than 70% fail.        
----------------------------------------
import java.io.*;
import java.util.*;
class Person
{
    int ssn;
    String name;
    void getdata(int ssn,String name)
    {
         this.ssn=ssn;
         this.name=name;
    }
    void display()
    {
       System.out.println("The ssn of person is: "+ssn);
       System.out.println("The name of person is: "+name);
    }
}
class student extends Person
{
   int rollno;
   String branch;
   float mark1,mark2,mark3;
   void getdata2(int rollno,String branch,float mark1,float mark2,float mark3)
    {
         this.rollno=rollno;
         this.branch=branch;
         this.mark1=mark1;
         this.mark2=mark2;
         this.mark3=mark3;
    }
    void display2()
    {
       System.out.println("The rollno of student is: "+rollno);
       System.out.println("The branch of student is: "+branch);
       System.out.println("The Mark1,Mark2 and Mark3 are:"+mark1+" "+mark2+" "+mark3);
       
    }
   
}
class grade extends student
{
   float avg; 
   float sum;
   void average()
   {
     sum=mark1+mark2+mark3;
     avg=sum/3;
   }
   void display3()
   {
       if(avg>=90)
       {
         System.out.println("A grade");
       }
       else if(avg>=80)
       {
         System.out.println("B grade");
       }
       else if(avg>=70)
       {
         System.out.println("C grade");
       }
       else if(avg<70)
       {
          System.out.println("Fail");
       }
   }
   
}

public class inheritance
{
    
    public static void main(String args[])
    {
      
      grade g=new grade();
      g.getdata(23035895,"Ajay");
      g.display();
      g.getdata2(99,"IT",90,90,89);
      g.display2();
      g.average();
      g.display3();
      
    }
}
----------------------------------------------------------------------------------------------------------------------
8.Create a class Person with the fileds first name and last name. Set the data and print it. Create two subclasses employee and staff with the variables and methods:
Employee:
Variables: eno, esal, designation
Methods: setEmployee(int, double, String) and displayEmployee()
Staff:
Variable: sno,experience
Methods:setStaff(int,int) and displayStaff()
Create a class to access the information of all
--------------------------------------------------
	
	
	
