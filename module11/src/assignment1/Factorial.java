package assignment1;


public class Factorial {
	public int Fact(int num){
	int fact=num;
	for(int i=num-1;i>1;i--){
		fact= fact*i;
		}
		return fact;
	}
	
	
public static void main(String[] args) {
		Factorial f = new Factorial();
		int c= f.Fact(4);
		System.out.println(c);

	}
}


