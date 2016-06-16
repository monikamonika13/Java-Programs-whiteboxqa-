package Assignment4;


import java.io.File;
import java.io.IOException;

public class listoffilenames {

	public static void main(String[] args) throws IOException {
		File file = new File("/Users/Amit/Documents/Selenium_Pack");
	        File[] files = file.listFiles();
	        for(File f: files){
	            System.out.println(f.getName());
	}
}
}
