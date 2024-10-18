class A5
{
	int age;
	
	public void show()
	{
		System.out.println("in show");
	}
	
	class B	{
		public void config()
	{
			System.out.println("in config");
	}
		}
	
	static class B1
	{
		public void config()
		{
			System.out.println("in static config");
		}
	}
}

public class  InnerClass{
    public static void main(String[] args) {
    	A5 obj=new A5();
    	obj.show();
    	
  	A5.B obj1=obj.new B();  //We can't directly call the class B we are using the reference of A5 and 
 	obj1.config();
    	
    	A5.B1 obj2=new A5.B1(); //As it is a static class we doesn't need Object we can directly call it with class name.
    	obj2.config();

    }
}