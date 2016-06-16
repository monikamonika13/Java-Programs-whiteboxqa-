package Assignment8;

public class executionOfStaticMethod {
	   int n;
	  public  executionOfStaticMethod(int n){
		this.n=n;  
	  }
	  public void  display2(){
		  System.out.println("constructor");
	  }
	static void display(){
		System.out.println("static method called");
	}
	static{
		System.out.println("static block called");
	}

	public static void main(String[] args) {
		 executionOfStaticMethod s= new  executionOfStaticMethod(5);
		display();
		 s.display2();
	}

}
