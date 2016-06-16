package Assignment8;

public class Print1To10Numbers {
	public void recursive(int n){
		if(n<=10){
			System.out.println(n);
			recursive(n+1);}
		}
			
	

	public static void main(String[] args) {
		Print1To10Numbers n= new Print1To10Numbers();
		n.recursive(1);
		

	}

}
