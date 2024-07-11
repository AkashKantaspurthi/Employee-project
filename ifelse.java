import java.util.*;
class Eod
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number");
int n;
n=sc.nextInt();
if(n%2==0)
System.out.println(n+" "+"is a even number");
else
System.out.println(n+" "+"is a odd number");
}
}


class Pon
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number");
int n=sc.nextInt();
if(n>=0)
System.out.println(n+" "+"is a positive number");
else
System.out.println(n+" "+"is a negative number");
}
}


class Vote
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the age of a person");
int age;
age=sc.nextInt();
if(age>=18)
System.out.println("eligible for voting");
else
System.out.println("not eligible for voting");
}
}


class Eon
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the values of a and b");
int a,b;
a=sc.nextInt();
b=sc.nextInt();
if(a==b)
System.out.println(a+"and "+b+"are equal");
else
System.out.println(b+"and "+b+"are not equal");
}
}


class Div
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number");
int n;
n=sc.nextInt();
if(n%5==0)
System.out.println(n+" "+"divisible by 5");
else
System.out.println(n+" "+"not divisible by 5");
}
}


class Div2and3
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number");
int n;
n=sc.nextInt();
if(n%2==0 && n%3==0)
System.out.println(n+" "+"is divisible by 2 & 3");
else
System.out.println(n+" "+"is not divisible by 2 & 3");
}
}


class Range
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the numbers of a,b and c");
int a,b,c,add;
a=sc.nextInt();
b=sc.nextInt();
c=sc.nextInt();
add=a+b+c;
if(add>=100 && add<=200)
System.out.println(add+" "+"is in the range of 100 to 200");
else
System.out.println(add+" "+"is not in the range of 100 to 200");
}
}


class Yon
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the character");
char ch;
ch=sc.next().charAt(0);
if(ch=='Y' || ch=='y')
System.out.println("YES");
else
System.out.println("NO");
}
}


class Lon
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the year");
int year;
year=sc.nextInt();
if((year%4==0 && year%100!=0) || (year%400==0))
System.out.println("leap year");
else
System.out.println("not aleap year");
}
}








