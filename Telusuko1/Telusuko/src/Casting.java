class A1
{
	public void show()
	{
		System.out.println("In A's Show");
	}
	public final void show2()
	{
	System.out.println("Hello");	
	}
}
class B1 extends A1
{
	public void show()
	{
		System.out.println("In B's Show");
	}
	public void show1()
	{
		System.out.println("In B's Show1");
	}
	
}
public class Casting {

	public static void main(String args[])
	{
		A1 ref=new B1();//Up Casting
		//ref.show1(); Not allowed with class A1 reference we can call only the methods of class A1.
		ref.show2();//Method will be present in the Child class but can't be Overridden in the child class
		ref.show();
		
		/*Down Casting --Even though ref is holding the Object of B it is referred to as A.
		(Similar to even though we are storing a int .we are storing it float).So inorder to use that we need to typecast.
		in the Same way even though ref is holding B object it is type of A .So in order to store it B type we have to type cast*/
		B1 ref1=(B1) ref;
		ref1.show1();
	}
}
