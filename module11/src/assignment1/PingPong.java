package assignment1;

public class PingPong {
	public void test(int n){
		if(n%3==0 &&
    			n%5==0){
    		System.out.println("pingpong");}
		
		else if( n%3==0){
        	System.out.println("ping");}
        else if (n%5==0){
        	System.out.println("pong");}
        	
        	else{
        		System.out.println("no is "+n);
        	}
        		
	}

	public static void main(String[] args) {
		PingPong p = new PingPong();
		p.test(3);
		}
	}


