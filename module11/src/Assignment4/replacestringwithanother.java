package Assignment4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class replacestringwithanother {

	public static void main(String[] args) {
	      {
	          try
	              {
	              File file = new File("//Users//Amit//Desktop//monika 2.txt");
	              BufferedReader reader = new BufferedReader(new FileReader(file));
	              String line = "", oldtext = "";
	              while((line = reader.readLine()) != null)
	                  {
	                  oldtext += line + "\r\n";
	              }
	              reader.close();
	              
	              String newtext = oldtext.replaceAll("Monika", "Amit");
	             
	              FileWriter writer = new FileWriter("//Users//Amit//Desktop//monika 2.txt");
	              writer.write(newtext);writer.close();
	          }
	          catch (IOException ioe)
	              {
	              ioe.printStackTrace();
	          }
	      }}}
	 



