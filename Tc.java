import java.util.*;
import java.io.*;
class Tc
{
public static void main(String args[])
{
int a=100;
long l=a;
System.out.println(l);

float f=3.142f;
int x=(int)f;
System.out.println(x);

double d=4.458345743975943;
float y=(float)d;
System.out.println(y);

long u=4795739949375L;
double z=u;
System.out.println(z);
}
}


class Sumavg
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a,b,c,sum;
float avg;
System.out.println("Enter the values of a,b,and c");
a=sc.nextInt();
b=sc.nextInt();
c=sc.nextInt();
sum=a+b+c;
avg=sum/3.0f;
System.out.println("Sum of three numbers=" +sum);
System.out.println("average of three numbers=" +avg);
}
}


class Area
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
float radius,area,circumference;
System.out.println("Enter the radius of a circle");
radius=sc.nextFloat();
area=3.14f*radius*radius;
circumference=2*3.14f*radius;
System.out.println("Area of a circle=" +area);
System.out.println("Circumference of a circle=" +circumference);
}
}


class Si
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
float principle_amount,rate_of_interest,SI;
int time_period;
System.out.println("Enter the principle amount");
principle_amount=sc.nextFloat();
System.out.println("Enter the time period");
time_period=sc.nextInt();
System.out.println("Enter the rate of interest");
rate_of_interest=sc.nextFloat();
SI=(principle_amount*time_period*rate_of_interest)/100;
System.out.println("Simpe Interest"+ SI);
}
}


class Art
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a,b;
System.out.println("Enter the values of a and b");
a=sc.nextInt();
b=sc.nextInt();
System.out.println("Addition of two numbers=" +(a+b));
System.out.println("Subtraction of two numbers=" +(a-b));
System.out.println("Multiplication of two numbers=" +(a*b));
System.out.println("Quotient of two numbers=" +(a/b));
System.out.println("Remainder of two numbers=" +(a%b));
}
}


class Temperature
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
float ft,ct;
System.out.println("Enter the fahrenheit temperature");
ft=sc.nextFloat();
ct=(ft-32.0f)*5/9;
System.out.println("celsius temperature=" +ct);
}
}


class Swaptemp
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the value of a");
int a=sc.nextInt();
System.out.println("Enter the value of b");
int b=sc.nextInt();
int t=a;
a=b;
b=t;
System.out.println("a value is=" +a);
System.out.println("b value is=" +b);
}
}


class Swap
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a,b;
System.out.println("Enter the value of a");
a=sc.nextInt();
System.out.println("Enter the value of b");
b=sc.nextInt();
a=a+b;
b=a-b;
a=a-b;
System.out.println("now a value is="+a);
System.out.println("now b value is="+b);
}
}


