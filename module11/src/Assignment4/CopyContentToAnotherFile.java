package Assignment4;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class CopyContentToAnotherFile {

	public static void main(String[] args) {
	    File infile =new File("//Users//Amit//Desktop//monika.txt");
	    File outfile =new File("//Users//Amit//Desktop//monika 2.txt");


       try {
		FileInputStream in = new FileInputStream(infile);
	
FileOutputStream out = new FileOutputStream(outfile);
byte[] buffer = new byte[1024];
	    int l;
	    while ((l = in.read(buffer)) > 0){
	    	out.write(buffer, 0, l);}
	    	 in.close();
	    	    out.close();
	    	    	}
	    	    catch (Exception e) {
	    			e.printStackTrace();}

	
	}}

