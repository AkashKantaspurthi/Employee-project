class D 
{
	int i,j;
	D()
	{
		System.out.println("***D() of class D***");
	}
	void funD()
	{
		System.out.println("***D() of funD()***");
	}
}
class E extends D
{
	int x,y;
	E()
	{
		System.out.println("***E() of E***");
	}
	void funE()
	{
		System.out.println("***funE() of E()***");
	}
}
class Indemo2
{
	public static void main(String[] args) 
	{
		E e1=new E();
	}

}
