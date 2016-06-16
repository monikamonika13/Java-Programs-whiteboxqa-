package Assignment3;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
     String original;
     Scanner in= new Scanner(System.in);
     System.out.println("Enter the palindrome");
     original= in.nextLine();
     String Reverse="";
     for(int i=original.length()-1;i>=0;i--){
    	 Reverse =  Reverse+ original.charAt(i);
     }

     if(Reverse.equals(original)){
    	 System.out.println("String is Palindrome");
     }else
    	 System.out.println("String is not Palindrome");
	}

}
