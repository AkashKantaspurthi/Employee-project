import java.util.*;
class Simplecalculator
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("*****SIMPLECALCULATOR*****");
System.out.println("+:Addition");
System.out.println("-:subtraction");
System.out.println("*:Multiplication");
System.out.println("/:Quotient");
System.out.println("%:Remainder");
int a,b,result;
char choice;
System.out.println("Enter the values of a and b");
a=sc.nextInt();
b=sc.nextInt();
System.out.println("Enter the choice");
choice=sc.next().charAt(0);
switch(choice)
{
case '+' : result=a+b;
	   System.out.println("Addition="+result);
	   break;
case '-' : result=a-b;
	   System.out.println("Subtraction="+result);
	   break;
case '*' : result=a*b;
	   System.out.println("Multiplication="+result);
	   break;
case '/' : result=a/b;
	   System.out.println("Quotient="+result);
	   break;
case '%' : result=a%b;
	   System.out.println("Remainder="+result);
	   break;
default : System.out.println("Invalid choice");
}
}
}



class Voc
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
char ch;
System.out.println("Enter the character");
ch=sc.next().charAt(0);
switch(ch)
{
	case 'A' :
	case 'E' :
	case 'I' :
	case 'O' :
	case 'U' :
	case 'a' :
	case 'e' :
	case 'i' :
	case 'o' :
	case 'u' : System.out.println("Vowel");
	  	   break;
	default  : System.out.println("constant");
}
}
}




class Yearconversion
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("*****YEARCONVERSION*****");
System.out.println("1:Months");
System.out.println("2:Days");
System.out.println("3:Hours");
System.out.println("4:Minutes");
System.out.println("5: Seconds");

int years,choice,days,months,hours,minutes,seconds;

System.out.println("Enter the number of years");
years=sc.nextInt();

System.out.println("Enter the choice");
choice=sc.nextInt();

months=12*years;
days=months*30;
hours=days*24;
minutes=hours*60;
seconds=minutes*60;

switch(choice)
{
	case 1: System.out.println("number of months="+months);
		break;
	case 2: System.out.println("number of days="+days);
		break;
	case 3: System.out.println("number of hours="+hours);
		break;
	case 4: System.out.println("number of minutes="+minutes);
		break;
	case 5: System.out.println("number of seconds="+seconds);
		break;
	default : System.out.println("Invalid choice");
}
}
}



class Temperature
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the temperature");
float temp=sc.nextFloat();
System.out.println("Enter the choice");
String choice=sc.next();
float ct=(temp-32.0f)*5/9;
float ft=(ct*9/5)+32.0f;
float kt=ct+273.03f;
switch(choice)
{
	case "ct": System.out.println("forenhet is ="+ft);
		   System.out.println("kelvin is ="+kt);
		   break;
	case "ft":System.out.println("celcious is ="+ct);
		  System.out.println("kelvin is ="+kt);
		  break;
	case "kt":System.out.println("forenhet is ="+ft);
		  System.out.println("celsius is ="+ct);
		  break;
	default : System.out.println("Enter the correct input");
}
}
}



class Tempsca
{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("*****TEMPERATURE CONVERSIONS******");
	System.out.println("1:FAHRENHET TEMPERATURE");
	System.out.println("2:CELSIUS TEMPERATURE");
	System.out.println("3:KELVIN TEMPERATURE");
	
	float it,kt=0,ft=0,ct=0;
	int choice;

	System.out.println("Enter the intial temperature");
	it=sc.nextFloat();

	System.out.println("Enter the choice");
	choice=sc.nextInt();

	if(choice==1||choice==2||choice==3)
	{

	switch(choice)
	{
		case 1:	ft=it;
			ct=(ft-32.0f)*5/9;
			kt=ct+273.03f;
			break;
		case 2: ct=it;
			ft=(ct*9)/5+32.0f;
			kt=ct+273.03f;
			break;
		case 3: kt=it;
			ct=(ft-32.0f)*5/9;
			ft=(ct*9)/5+32.0f;
			break;
	}
	System.out.println("Fahrenhet temperature="+ft);
	System.out.println("Celsius temperature="+ct);
	System.out.println("Kelvin temperature="+kt);
	}
	}
}



class Geo
{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("*****AREA OF GEOMETRICAL SHAPES*****");								System.out.println("120:CIRCLE");
	System.out.println("124:SQUARE");
	System.out.println("117:RECTANGLE");
	System.out.println("112:TRIANGLE");

	float area,radius,side,length,breadth,base,height;

	System.out.println("Enter the figure code");
	int fig_code=sc.nextInt();

	switch(fig_code)
	{
		case 120: System.out.println("Enter the radius");
			  radius=sc.nextFloat();
			  area=3.14F*radius*radius;
			  System.out.println("Area of circle="+area);
			  break;
		case 124: System.out.println("Enter the side");
			  side=sc.nextFloat();
			  area=side*side;
			  System.out.println("Area of square="+area);
			  break;
		case 117: System.out.println("Enter the length aand breadth");
			  length=sc.nextFloat();
			  breadth=sc.nextFloat();
			  area=length*breadth;
			  System.out.println("Area of rectangle="+area);
			  break;
		case 112: System.out.println("Enter the base and height");
			  base=sc.nextFloat();
			  height=sc.nextFloat();
			  area=0.5F*base*height;
			  System.out.println("Area of triangle="+area);
			  break;
		default : System.out.println("Invalid figure code");
	}
	}
}



