package Assignment7;

public class Exception {

	public static void main(String[] args) {
     int a= 10;int b=20;
     System.out.println("Before exception");
     try{
    	 String s= null;
     
     if(s.equals("TEST")){
    	 System.out.println(b);
     } }catch(NullPointerException e)
     { e.printStackTrace();
     System.out.println("Exception occured");
}finally
     {
	System.out.println("Exit");
     }
     System.out.println(a);
	}

}
