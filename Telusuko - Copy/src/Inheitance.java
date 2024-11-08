
public class Inheitance {

	public static void main(String[] args) {

		ScientificCal advc=new ScientificCal();
		int addres=advc.add(10,20);
		int subres=advc.sub(20, 2);
		int mulres=advc.mul(15, 2);
		int divres=advc.div(10, 2);
		double res=advc.pow(10, 2);
		System.out.println(addres+" "+subres+" "+mulres+" "+divres+" "+res);
	}

}
