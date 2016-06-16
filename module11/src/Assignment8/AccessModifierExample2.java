package Assignment8;

public class AccessModifierExample2 {
     protected int division(){
    	 return 7;
     }
	 public static void main(String[] args) {
		 AccessModifierExample am= new AccessModifierExample();
		 am.sum();
		 am.name();
		 //am.mulpitly(can't call this funtion as it is private
		 AccessModifierExample2 am2= new AccessModifierExample2();
		 am2.division();
		 


	}}


