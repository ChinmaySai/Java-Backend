import calculator.AdvCalc;
import calculator.Calc1;//import single class seperately
import calculator.*;//importing all the classes of the calculator package

public class PackageCalculator {

	public static void main(String[] args) {

		AdvCalc ac=new AdvCalc();
		Calc1 c1=new Calc1();
		System.out.println(ac.add(10, 20));
		System.out.println(c1.add(20, 30));
		
	}
}
