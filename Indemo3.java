class A 
{
	int i=1,j=2;
	void funA()
	{
		i=i+1;
		j=j+1;
		System.out.println("*** fun A() of A***");
	}
}

class P extends A
{
	int i,j,x;
	void funP()
	{
		x=113;
		i=i+1;
		j=j+1;
	System.out.println("***fun P of class P");
	}
}
class Q extends P
{
	int i,j;
	void funP()
	{
		System.out.println("***funp() of class Q");
	}
	void funQ()
	{
		i=6;
		super.i=13;
		j=19;
		super.j=26;
		funP();
		System.out.println("***funQ() of class Q");
	}
	public static void main(String[] args) 
	{
		Q q1=new Q();
		q1.funP();
		q1.funQ();
		System.out.println();
		System.out.println("q1.x"+q1.x);
		System.out.println("q1.i"+q1.i);
		System.out.println("q1.j"+q1.j);
	}

}
