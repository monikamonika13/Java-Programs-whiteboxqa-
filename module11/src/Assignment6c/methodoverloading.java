package Assignment6c;

public class methodoverloading {
	
	  public int sum(){
		  int firstnum= 10;
		  int secondnum= 20;
		  int s1=firstnum+secondnum;
		  return s1;}
		  
		  public double sum(int a,double b){
			 double s2=a+b;
			 return s2;
		  }
		  public int sum(int c,int d,int e){
			  int s3=c+d+e;
			  return s3;
		  }
	  

	public static void main(String[] args) {
		methodoverloading obj= new methodoverloading();
		int z1=obj.sum();
		double z2= obj.sum(5,6.7);
		int z3= obj.sum(7,9,2);
		System.out.println(z1);
		System.out.println(z2);
		System.out.println(z3);



	}

}
