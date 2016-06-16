package Assignment4;

import java.io.DataInputStream;
import java.io.IOException;

public class Innovapath3file {

	public static void main(String[] args) {
		try{
  
        DataInputStream dis = new DataInputStream(System.in);
        System.out.println("Enter First Number");
        int a =dis.readInt();
        System.out.println("Enter Second Number");
        int b = dis.readInt();
        int multiply = a*b;
        System.out.println("product is "+multiply);
       
	}catch(IOException e){}
		finally{
		}
	}
		
	}



