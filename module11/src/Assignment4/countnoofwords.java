package Assignment4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class countnoofwords {

	public static void main(String[] args)throws IOException {
		
		   System.out.println ("Counting Words");   
		   File file = new File("//Users//Amit//Desktop//monika.txt");
           BufferedReader reader = new BufferedReader(new FileReader(file));    
		       String line = reader.readLine ();
		       int count = 0;
		       while (line != null) {
		          String []parts = line.split(" ");
		          for( String w : parts)
		          {
		            count++;        
		          }
		          line = reader.readLine();
		       }         
		       System.out.println(count);
		    }
		}
	

