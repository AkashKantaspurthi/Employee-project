import java.util.Scanner;
class Incredecre1
{
public static void main(String args[])
{
int a=12,b=13,c=11;
a=a++ + --b + c++;
b=b++ + ++a*2;
c=c++ + a++ *(++b);
System.out.println(a+" "+b+" "+c);
}
}


class Incredecre2
{
public static void main(String args[])
{
int i=19,j=29,k;
k=i-- - i++ + --j - ++j + --i - j-- + ++i - j++;
System.out.println(i+" "+j+" "+k);
}
}


class Incredecre3
{
void printInc()
{
int a=1,b=2;
int c=--b - ++a + ++b - --a;
System.out.println(c);
}
public static void main(String args[])
{
Incredecre3 i=new Incredecre3();
i.printInc();
}
}


class Incredecre4
{
static void printI()
{
int i=11,I;
I=i++ + ++i;
System.out.println(I);
}
public static void main(String args[])
{
Incredecre4.printI();
}
}


class Incredecre5
{
int printDec(int a,int b)
{
int c=(a+b++) + (--a + b--);
return c;
}
public static void main(String args[])
{
Incredecre5 i=new Incredecre5();
int a=i.printDec(4,9);
System.out.println(a);
}
}


class Incredecre6
{
static int printA()
{
int i=0;
i=i++ - --i + ++i - i--;
return i;
}
public static void main(String args[])
{
int a=Incredecre6.printA();
System.out.println(a);
}
}


class Incredecre7
{
static void printId()
{
int x=10,y;
y=++x + x++ + x++;
System.out.println(y);
}
public static void main(String args[])
{
Incredecre7.printId();
}
}


class Incredecre8
{
static int printDi()
{
int i=4,x=++i + ++i + ++i;
return x;
}
public static void main(String args[])
{
int b=Incredecre8.printDi();
System.out.println(b);
}
}


class Incredecre9
{
void printAb()
{
System.out.println("Value of x");
Scanner sc=new Scanner(System.in);
int x=sc.nextInt();
System.out.println("Value of y");
int y=sc.nextInt();
int s1=x+(++y);
int s2=++x + y++;
System.out.println("s1= "+s1);
System.out.println("s2= "+s2);
}
public static void main(String args[])
{
Incredecre9 a1=new Incredecre9();
a1.printAb();
}
}


class Incredecre10
{
int printS()
{
Scanner sc=new Scanner(System.in);
System.out.println("Value of a");
int a=sc.nextInt();
System.out.println("Value of b");
int b=sc.nextInt();
int c=a + b + a++ + b++ + ++a + ++b;
System.out.println("Value of c "+c);
return c;
}
public static void main(String args[])
{
Incredecre10 i1=new Incredecre10();
int i=i1.printS();
System.out.println(i);
}
}


class Incredecre11
{
static void printX()
{
Scanner sc=new Scanner(System.in);
System.out.println("Value of a");
int a=sc.nextInt();
System.out.println("Value of b");
int b=sc.nextInt();
System.out.println("Value of c");
int c=--b - ++a + ++b - --a;
System.out.println(c);
}
public static void main(String args[])
{
Incredecre11.printX();
}
}






