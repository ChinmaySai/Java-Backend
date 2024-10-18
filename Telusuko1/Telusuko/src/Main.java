class Calculator
{
	int a;
	public int add(int n1,int n2)
	{
		a=n1+n2;
		return a;
	}
}
public class Main {

	public static void main(String[] args) {

		Calculator c1=new Calculator();
		int res=c1.add(10, 50);
		System.out.println("Res "+res);
	}

}
