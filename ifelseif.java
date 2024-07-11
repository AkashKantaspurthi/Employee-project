import java.util.*;
class Height
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int ht;
System.out.println("Enter the height of a person");
ht=sc.nextInt();
if(ht<150)
System.out.println("Dwarf");
else if(ht>=150 && ht<165)
System.out.println("Average Height");
else if(ht>=165 && ht<180)
System.out.println("Taller");
else
System.out.println("Abnormal height");
}
}




class Ebill
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int previous,current,total_units;
float e_bill;
System.out.println("Enter the current and previous meter reading");
current=sc.nextInt();
previous=sc.nextInt();
total_units=current-previous;
System.out.println("total units consumed in that particular month="+total_units);
if(total_units>=0 && total_units<=100)
e_bill=total_units*0.8f;
else if(total_units>=101 && total_units<=200)
e_bill=80+(total_units-100)*1.2f;
else if(total_units>=201 && total_units<=300)
e_bill=200+(total_units-200)*1.5f;
else
e_bill=350+(total_units-300)*1.8f;
System.out.println("electricity bill="+e_bill);
}
}



class Lot6
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a,b,c,d,e,f;
System.out.println("Enter the values of a,b,c,d,e and f");
a=sc.nextInt();
b=sc.nextInt();
c=sc.nextInt();
d=sc.nextInt();
e=sc.nextInt();
f=sc.nextInt();
if(a<b && a>c && a>d && a>e && a>f)
System.out.println("a is largest");
else if(b>c && b>d && b>e && b>f)
System.out.println("b is largest");
else if(c>d && c>e && c>f)
System.out.println("c is largest");
else if(d>e && d>f)
System.out.println("d is largest");
else if(e>f)
System.out.println("e is largest");
else
System.out.println("f is largest");
}
}



class Grosssalary
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
float Basicsalary,DA,HRA,Conveyance,PF,Netsalary,Grosssalary;
System.out.println("Enter the basic salary of an employee");
Basicsalary=sc.nextFloat();
if(Basicsalary>=5000)
{
DA=(110*Basicsalary)/100;
HRA=(20*Basicsalary)/100;
Conveyance=500;
}
else if(Basicsalary>=3000 && Basicsalary<5000)
{
DA=Basicsalary;
HRA=(5*Basicsalary)/100;
Conveyance=300;
}
else
{
DA=(90*Basicsalary)/100;
HRA=(10*Basicsalary)/100;
Conveyance=200;
}
Grosssalary=Basicsalary+DA+HRA+Conveyance;
PF=(Basicsalary*8.33f)/100;
Netsalary=Grosssalary-PF;
System.out.println("Grosssalary of an employee="+Grosssalary);
System.out.println("Netsalary of an employee="+Netsalary);
}
}



class Grade
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int s1,s2,s3,s4,s5,s6,sum;
float avg;
System.out.println("Enter the six subject marks");
s1=sc.nextInt();
s2=sc.nextInt();
s3=sc.nextInt();
s4=sc.nextInt();
s5=sc.nextInt();
s6=sc.nextInt();
if(s1<=35 || s2<=35 || s3<=35 || s4<=35 || s5<=35 || s6<=35)
System.out.println("Fail");
else
{
sum=s1+s2+s3+s4+s5+s6;
avg=sum/6.0f;
if(avg>=35 && avg<50)
System.out.println("Third division");
else if(avg>=50 && avg<60)
System.out.println("Second division");
else if(avg>=60 && avg<70)
System.out.println("First division");
else
System.out.println("Distinction");
}
}
}



class Teleph
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String contact;
float units,t_bill;
System.out.println("Enter the units");
contact=sc.next();
units=sc.nextFloat();
if(units<=80)
t_bill=250.0f;
else if(units>=80 && units<140)
t_bill=250.0f+(units-80)*0.6f;
else if(units>=140 && units<200)
t_bill=250.0f+(units-80)*0.6f+(units-140)*0.5f;
else
t_bill=250.0f+(units-80)*0.6f+(units-140)*0.5f+(units-200)*0.4f;
System.out.println("telephone bill="+t_bill);
}
}



