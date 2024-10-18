
public class CommandLine {

	public static void main(String[] args) {
            
		if(args.length<0) {
			System.out.println("No Elements in Arrays");
		}
		else {
		  for(String s:args)
		  {
			  System.out.println(s);
		  }
	      }
	}

}
