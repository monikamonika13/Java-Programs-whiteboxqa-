package assignment1;

import java.util.Scanner;

public class swppingwithout {

	public static void main(String[] args) {
		int x,y;
		System.out.println("enter the value of x and y");
		Scanner in =new Scanner(System.in);
		x=in.nextInt();
		y=in.nextInt();
		System.out.println("nos before swapping "+x+y);
		x=x+y;
		y=x-y;
		x=x-y;
		System.out.println("nos after swapping"+x+y);
	}

}




