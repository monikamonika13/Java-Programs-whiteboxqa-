package Assignment5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class AddElementsaArraylist {

	public static void main(String[] args) {
      ArrayList<String>alist= new ArrayList<String>();
      alist.add("A");
      alist.add("B");
      alist.add("C");
      alist.add("D");
      
     
     ListIterator<String>it1= alist.listIterator();
       while(it1.hasNext()){
    	   System.out.println(it1.next());
       }
     
            while(it1.hasPrevious()){
          System.out.println(it1.previous());  }
            
          for(String k:alist){
              if(k.equals("B"))  {
      System.out.println("element B is present");   } }
          }}
        
     
          
      
      
	


