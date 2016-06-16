package Assignment3;

public class Replacestring {

	public static void main(String[] args) {
      String a= "carpool";
      
      char[] searchChar="pool".toCharArray();
      char[]chararray1= a.toCharArray();
      char[] b= "port".toCharArray();
      
      int i=0;
      int j=0;
      
      char[] replace=null;
      
      while(i<chararray1.length && j<searchChar.length )
      {  
    	 if(chararray1[i]==searchChar[j])
    	 {
    		 i++;
    		 j++;
    	 }
    	 else
    	 {
    		 
    		 i++;
    		 j=0;
    	 }
    	 
    	 if(j==searchChar.length)
    	 {
    		 int start=i-searchChar.length;
    		 int end=i-searchChar.length+b.length;
    		 replace = new char[i-searchChar.length+b.length];
    		 for(int k =0;k<start;k++)
    		 {
    			 replace[k]=chararray1[k];
    		 }
    		 int q=0;
    		 for(int k =start;k<end;k++)
    		 { 
    			 
    			 replace[k]=b[q];
    			 q++;
    		 }
    		  
    			
    	 }
    	  
      }
      
      String str=new String(replace);
      
      System.out.println(str);
      
      
      
      
	}
      
}
        
      
      
	


