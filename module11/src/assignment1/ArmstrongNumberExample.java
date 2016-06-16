package assignment1;

public class ArmstrongNumberExample {
	public int armstrong(int n){
	     int c=0,a,b;
	     while(n>0){
	    	 a=n%10;
	    	 n=n/10;
	    	 c=c+(a*a*a);
	     }
	     return c;
	     }

	public static void main(String[] args) {
		ArmstrongNumberExample A= new ArmstrongNumberExample();
		int e=153;
	     int d= A.armstrong(153);
		if(d==e){
			System.out.println("Armstrong Number");}
			else
				System.out.println("Not an Armstrong Number");
			}

}
