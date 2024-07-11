import java.io.*;
class Lot
{
public static void main(String args[])
{
int a=40,b=60,largest;
largest=(a>b)?a:b;
System.out.println("largest of two numbers="+largest);
}
}


class Pon
{
public static void main(String args[])
{
int n=0;
String result;
result=(n>=0)?"positive number":"negative number";
System.out.println(result);
}
}


class Val
{
public static void main(String args[])
{
char ch='A';
int result;
result=(ch>='A' && ch<='Z')?1:0;
System.out.println(result);
}
}


class Tri
{
public static void main(String args[])
{
int a=12,b=45,c=32;
String result;
result=(a!=b && b!=c && c!=a)?"scalene":"not a scalene";
System.out.println(result);
}
}


class Pal
{
public static void main(String args[])
{
int n=121;
String result;
result=(n/100==n%10)?"palindrome":"not a palindrome";
System.out.println(result);
}
}

class Eoo
{
public static void main(String main[])
{
int n=24;
String result;
result=(n%2==0)?"even number":"odd number";
System.out.println(result);
}
}


class Lot
{
public static void main(String args[])
{
int a=60,b=80,c=40,largest;
largest=((a>b) && (a>c))?a:((b>c)?b:c);
System.out.println("largest of two numbers="+largest);
}
}


class Lot
{
public static void main(String args[])
{
int a=5,b=6,c=7,largest;
largest=((a<b) && (a<c))?b:c;
System.out.println("largest of two numbers="+largest);
}
}




