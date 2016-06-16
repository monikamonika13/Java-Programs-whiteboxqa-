package assignment1;

public class PrimeNumber {
	public boolean primeno(int n){
		for (int i=2;i<n/2;i++){
			if(n%i==0){
				return false; }
		}
				return true;
			}
			
		
		
	
	public static void main(String[] args) {
		PrimeNumber num = new PrimeNumber();
	boolean P=num.primeno(8);
	System.out.println(P);
		
     
	}

}
