package Assignment6c;

public class Circle extends Shape1 {
	public  final double PI= 3.14;
     double r;
     public Circle(double r){
    	 this.r=r;    }
     

	public double area() {
				return PI*r*r;
	}

	public double circumference() {
				return 2*PI*r;
	}


	}
	


