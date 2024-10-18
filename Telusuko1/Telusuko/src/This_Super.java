class A
{
	A()
	{
		System.out.println("A's Construcotr");
	}
	A(int n)
	{
		
	}
}
class B extends A
{
	B()
	{
		System.out.println("B's Constructor");
	}
	B(int n)
	{
		System.out.println("B 's int Constructor");
	}
}
public class This_Super {

	public static void main(String[] args) {

		B b=new B();
		new B(5);
	}

}
