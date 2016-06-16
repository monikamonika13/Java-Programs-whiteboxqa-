package assignment2;

public class MissingNoInArray {
	public int missingno(int[]arr1){
		int n=8;int sum1=0;
		 int sum= (n*(n+1))/2;	
		 for(int i=0;i<arr1.length;i++)
		 {
			 sum1= sum1+arr1[i];
		 }
		 int a =sum-sum1;
		 return a;
	}
	
	


	public static void main(String[] args) {
		MissingNoInArray mi= new MissingNoInArray();
 int[]array={1,2,4,3,7,8,6};
   int c= mi.missingno(array);
 System.out.println("missing no is"+c);
 
	}


}