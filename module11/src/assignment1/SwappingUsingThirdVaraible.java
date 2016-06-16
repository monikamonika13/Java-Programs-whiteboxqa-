package assignment1;

import java.util.Scanner;

public class SwappingUsingThirdVaraible {

	public static void main(String[] args) {
		int x,y,temp;
		System.out.println("enter x and y");

		Scanner input = new Scanner(System.in);
		 x= input.nextInt();
		 y= input.nextInt();
		
		System.out.println("before swapping"+ x +y);
		temp= x;
		x=y;
		y=temp;
		System.out.println("after swapping "+x +y);
	}

}
