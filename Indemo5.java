class M 
{
	int i,j;
	void funM()
	{
		System.out.println("***fun M() of M***");
	}
	void funN()
	{
		System.out.println("***fun N() of N***");
	}
}
class N extends M
{
	void funN()
	{
		System.out.println("***fun N() of N***");
	}
	void fun1()
	{
		System.out.println("***fun 1() of N***");
	}
	void funA()
	{
		System.out.println("***fun A() of A***");
	}
}
class Indemo5
{
	public static void main(String[] args)
	{
		M m=new N();
		m.funM();
	//	m.fun1();
		m.funN();
		m.i=13;
	}

}
