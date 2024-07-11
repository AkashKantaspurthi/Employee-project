import java.util.*;
class P
{
	void funP(int x)
	{
		int sq=x*x;
		System.out.println("sq"+sq);
	}
}
class Q extends P
{
	void funP(int x)
	{
		int fact=1;
		for(int i=1;i<=x;i++)
		{
			fact=fact*i;
		}
		System.out.println("factorial of"+x+"no's"+fact);
	}
}
class R extends P
{
	void funP(int x)
	{
		int sum=0;
		for(int i=0;i<=x;i++)
		{
			sum=sum+i;
		}
		System.out.println("sum of"+x+"no's"+sum);
	}
}
class Dyploytest 
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value x");
		int x=sc.nextInt();
		System.out.println("Enter the value i");
		int i=sc.nextInt();
		P p1=null;
		if(i>0 && i<=10)
		{
			p1=new P();
		}
		if(i>10 && i<=20)
		{
			p1=new R();
		}
		if(i>20)
		{
			p1=new Q();
		}
		p1.funP(x);
	}

}