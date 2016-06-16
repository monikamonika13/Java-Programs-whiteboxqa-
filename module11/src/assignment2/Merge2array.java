package assignment2;

public class Merge2array {

	public static void main(String[] args) {
     int[]a={1,2,4,6,10};
     int[]b={5,7,8,11,12};
      int[]c=new int[a.length+b.length];
     int d= a.length+b.length;
       int i=0;
       int j=0;
       int k=0;
       
       while(i<a.length & j<b.length)
       {   
    	 if(a[i]<b[j])
    	 {
    	   c[k]=a[i];
    	   i++; 
    	   }  
    	   else
    	   {
    		   c[k]=b[j];
    		   j++;
    	   }
    	k++;
    	
    	}
       
       if(i<a.length)
       {
    	   while(i<a.length)
    	   {
    		   c[k]=b[i];
    		   i++;
    		   k++;  
    	   }
       }
       else
       {
    	   while(j<b.length)
    	   {
    		   c[k]=b[j];
    		   j++;
    		   k++;  
    	   }
       }
       
       for(k=0;k<d;k++){
       System.out.println(c[k]);}
      
  }
    
	}



