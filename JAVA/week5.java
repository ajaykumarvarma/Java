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