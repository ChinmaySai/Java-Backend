/*final class Calcul
{
	public void show()
	{
		System.out.println("Inside calcul show()");
	}
	public void add(int a,int b)
	{
		System.out.println(a+b);
	}
}

class B extends Calcul           ///If a class we can't inherit/extend it.
{
	
}
*/

/*Final Method
class A
{
	public final void show()
	{
		System.out.println("Chinmay Class");
	}
}
class B extends A
{
	public void show()                    //When a method is made as final we can't Override it
	{
		
	}
}
*/
public class Final_keyword {

	public static void main(String args[])
	{
		final int a;
		a=10;
		//a=11; //results in Complile Time Error as the value is already assigned
		System.out.print(a);
       
		
	}
}
