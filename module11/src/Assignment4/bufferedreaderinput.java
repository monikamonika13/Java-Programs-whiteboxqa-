package Assignment4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class bufferedreaderinput {

	public static void main(String[] args) throws NumberFormatException, IOException {
           try{
		  int n1,n2,n3;
	        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	        System.out.println("Enter first number: ");
	        n1=Integer.parseInt(br.readLine());

	        System.out.println("Enter second number: ");
	        n2=Integer.parseInt(br.readLine());

	        n3=n1-n2;
	        System.out.println("Subtraction of two given numbers is: " +n3);}
	        catch(IOException e)
	        {
	        	System.out.println("error" +e.getMessage());
	        }

	}
}

	
	

