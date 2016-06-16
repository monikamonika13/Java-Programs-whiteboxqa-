package Assignment7;

public class Exceptionb {
	public static void checkage(int age){
	   if(age<18){
		   
         int b=age/0;;
       System.out.println(b);
		throw new ArithmeticException();


       }else{
       	System.out.println("hello");}
       	}
	static void check(int age){
		checkage(age);
		throw new ArithmeticException();

	}


	public static void main(String[] args) {
		try{
		Exceptionb.check(1);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Error came");
		}
	}

}
