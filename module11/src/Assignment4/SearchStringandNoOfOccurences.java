package Assignment4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class SearchStringandNoOfOccurences {

	public static void main(String[] args) {
	HashMap<String, Integer> countwords = new HashMap<String, Integer>();
		      BufferedReader reader = null;
		        try
		        {
		            reader = new BufferedReader(new FileReader("//Users//Amit//Desktop//monika.txt"));
		            String currentLine = reader.readLine();
		             
		            while (currentLine != null)
		            {    
		                 String[] words = currentLine.toLowerCase().split(" ");
		                 for (String word : words)
		                {
		                  if(countwords.containsKey(word))
		                    {    
		                	  countwords.put(word, countwords.get(word)+1);
		                    }
		                    else
		                    {
		                    	countwords.put(word, 1);
		                    }
		                }
		                 
		                 currentLine = reader.readLine();
		            }
		             
		           String mostRepeatedWord = null;
		              int count = 0;
		             
		            Set<Entry<String, Integer>> entrySet = countwords.entrySet();
		             
		            for (Entry<String, Integer> entry : entrySet)
		            {
		            	System.out.println("cnt"+count);
		            	System.out.println(entry.getKey()+":"+entry.getValue());
		                if(entry.getValue() > count)
		                {
		                    mostRepeatedWord = entry.getKey();
		                    System.out.println("inside if"+mostRepeatedWord);
		                     
		                    count = entry.getValue();
		                    System.out.println(count);
		                }
		            }
		             
		            System.out.println("The most repeated word in input file is : "+mostRepeatedWord);
		             
		            System.out.println("Number Of Occurrences : "+count);
		        } 
		        catch (IOException e) 
		        {
		            e.printStackTrace();
		        }
		        finally
		        {
		            try
		            {
		                reader.close();          
		            }
		            catch (IOException e) 
		            {
		                e.printStackTrace();
		            }
		        }
		    }    
}
	


