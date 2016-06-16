package Assignment5;

import java.util.ArrayList;

public class CopyArraylistToArray {

	public static void main(String[] args) {
		 ArrayList<String> array1 = new ArrayList<String>();
	        array1.add("First");
	        array1.add("Second");
	        array1.add("Third");
	        array1.add("fourth");
	        System.out.println("arraylist elements:" +array1);
	        String[]array2 = new String[array1.size()];
	        array1.toArray(array2);
	        System.out.println("array created");
	        for(String s:array2){
	        	System.out.println(s);
	        }
	}

}
