package Assignment5;

import java.util.ArrayList;
import java.util.HashSet;

public class DuplicatesUsingSet {

	public static void main(String[] args) {
   ArrayList<String>list = new ArrayList<>();
   HashSet<String>myset=new HashSet<>();
   list.add("cat");
   list.add("dog");
   list.add("mouse");
   list.add("cat");
   list.add("elephant");
   list.add("bird");
   for(String s:list){
	   if(myset.add(s)==false)
	   System.out.println(s);
   }
  
   }



   
	}


