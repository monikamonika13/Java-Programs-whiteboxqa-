package assignment2;

import java.util.Scanner;

public class Linearsearch {

	public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       System.out.println("enter the no of elements");
       int n= in.nextInt();
       int[]arr= new int[n];
       System.out.println("enter the elements");
       for(int i=0;i<n;i++){
    	   arr[i]= in.nextInt();}
    	   System.out.println("enter search element");
    	   int search=in.nextInt();
    	   for(int i=0;i<n;i++){
    		   if(arr[i]==search){
    			   System.out.println(+search +"is present at location" + (i+1));
    			 break;
    		   }
    		   
    		   else if( i==n){
    			   System.out.println("search is not present");}
    		   }
	}
    	   }
 
       
       



