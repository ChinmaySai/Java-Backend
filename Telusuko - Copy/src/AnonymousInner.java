class Ano
{
	public void show() 
	{
		System.out.println("in A show");
	}
}
//class B extends A
//{
//	public void show()
//	{
//		System.out.println("in B Show");
//	}
//}

public class  AnonymousInner{
    public static void main(String[] args) {
    	
    	//A obj=new B();
    	
    	Ano obj=new Ano() 
    	{
    		public void show()
    		{
    			System.out.println("in new show");
    		}
    	};
    	obj.show();
    }
}