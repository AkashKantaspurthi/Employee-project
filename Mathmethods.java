import java.lang.*;
import java.io.*;
import java.util.*;
class Mathmethods
{
public static void main(String args[])
{
int a=3,b=-4,c=10;
float d=3.14f;
System.out.println(Math.abs(b));
System.out.println(Math.pow(a,2));
System.out.println(Math.sqrt(a));
System.out.println(Math.cbrt(a));
System.out.println(Math.log(a));
System.out.println(Math.log10(c));
System.out.println(Math.min(a,b));
System.out.println(Math.max(a,b));
System.out.println(Math.floor(d));
System.out.println(Math.abs(b));
System.out.println(Math.ceil(d));
System.out.println((int)Math.random());
int min=0,max=1000;
System.out.println((int)(Math.random()*(max-min+1))+min);
}
}


class Commandla
{
public static void main(String args[])
{
int a=Integer.parseInt(args[0]);
int b=Integer.parseInt(args[1]);
System.out.println(a+b);
float c=Float.parseFloat(args[2]);
float d=Float.parseFloat(args[3]);
System.out.println(c*d);
String s1=args[4];
String s2=args[5];
System.out.println(s1+s2);
}
}


class Oddnumber
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n;
System.out.println("Enter the value of n");
n=sc.nextInt();
if(n%2==1)
System.out.println(n+" "+"is an odd number");
}
}


class Ratioswap
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
float a,b,ratio,temp;
System.out.println("Enter the values of a and b");
a=sc.nextFloat();
b=sc.nextFloat();
ratio=a/b;
System.out.println("Ratio="+ratio);
if(ratio>0)
{
temp=a;
a=b;
b=temp;
}
System.out.println("value of a="+a+" "+"value of b="+b);
}
}
