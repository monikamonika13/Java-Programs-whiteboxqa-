package Assignment8;

public class AccessModifierExample {
	
	 public int  sum(){
		 return 1;
	 }
	 private int  multiply(){
		 return 3;
	 }
	 String name(){
		return "Monika";
	 }
	 public static void main(String[] args) {
		 AccessModifierExample AM= new  AccessModifierExample();
		 int A=AM.sum();
		int B= AM.multiply();
		 String C=AM.name();
		 AccessModifierExample2 AM2= new AccessModifierExample2();
		int D= AM2.division();
		 System.out.println("Public function called " +" "+A);
		 System.out.println("Private can be called from same class"+" "+B);
		 System.out.println("Deafult function can be called from same package"+" "+C);
		 System.out.println("protected can be called from same package and subclass"+" " +D);


		 
		 
		 
		 
  }

}
