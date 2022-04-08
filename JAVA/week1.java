#Program 1to find Mean

import java.io.*;
import java.util.*;
public class Mean
{
 public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int count=0;
int sum=0;
while(sc.hasNextInt()){
int n=sc.nextInt();
sum=sum+n;
count=count+1;
}
float means=sum/count;
System.out.println("Mean is: "+means);
}
}

---------------------------------------------------------------------------------------
  
  #program2 tofind prime numbers count in given 4digit number
  
 import java.io.*;
import java.util.*;
public class prime
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n,i;
int flag=0;
System.out.print("Enter 4 DigitNumber:");
n=sc.nextInt();
int count=0;
while(n!=0){
flag=0;
int rem=n%10;
for(i=1;i<=rem;i++){
if(rem%i==0){
  flag=flag+1;
}
}
if(flag==2){
count+=1;
}

n=n/10;
}
System.out.println("The number of primes in entered is: "+count);
}
}
