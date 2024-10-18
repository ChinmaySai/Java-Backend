import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedRea {

	public static void main(String[] args) throws IOException {
     BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
     System.out.println("Please enter the Input for the Buffered Reader : ");
     String name=br.readLine();
     System.out.println("Entered Name is : "+name);
		
		
	}

}
