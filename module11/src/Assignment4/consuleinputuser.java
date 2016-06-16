package Assignment4;

import java.io.Console;

public class consuleinputuser {

	public static void main(String[] args)  {
		try{
		Console con = System.console();
	        String input = con.readLine("Please enter your first number:");
	        int newinput = Integer.parseInt(input);
	        String input2 = con.readLine("Please enter your second number: ");
	        int newinput2 = Integer.parseInt(input2);
	      
	        int div = newinput / newinput2;
	        
	        System.out.print(div);
		}catch(NullPointerException e)
		 {
        	System.out.println("error" +e.getMessage());
        }

		}
	
}