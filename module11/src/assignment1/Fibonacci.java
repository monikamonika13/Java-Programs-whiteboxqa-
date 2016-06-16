package assignment1;

public class Fibonacci {
	    int n1=0,n2=1,n3;
	  
	  public   int[] fibonacciexample(int count){
		  int[]a = new int[count];
		   a[0]=0;
		   a[1]=1;
		   for(int i=2;i<count;i++){
			   n3=n1+n2;
			   n1=n2;
			   n2=n3;
			   a[i]=n3;
			   }
		   
		   return a;
	   }

	public static void main(String[] args) {
		Fibonacci f1= new Fibonacci();
		int[]x=f1.fibonacciexample(10);
		for(int j=0;j<10;j++){
		System.out.println(x[j]);}

	}

}
