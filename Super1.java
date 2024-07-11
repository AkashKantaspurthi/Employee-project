class Super1 
{
	int a,b;
	Super1()
	{
		System.out.println("***super1() of super1***");
	}
	Super1(int x)
	{
		a=x;
		b=x+1;
		System.out.println("***super1(int x) of super1***");
	}
}
class Sub1 extends Super1
{
	int i,j;
	Sub1()
	{
		super(5);
		System.out.println("***sub1() of sub1***");
	}

	public static void main(String[] args)
	{
		Sub1 s=new Sub1();
		System.out.println(s.i);
		System.out.println(s.j);
		System.out.println(s.a);
		System.out.println(s.b);
	}

}
