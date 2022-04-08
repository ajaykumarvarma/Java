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
  
  
