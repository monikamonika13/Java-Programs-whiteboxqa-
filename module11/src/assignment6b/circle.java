package assignment6b;

public class circle implements shape {
	    public double radius;
	    public circle(double radius ){
	    	this.radius=radius;
	    	
	    }
           public double getArea(){
			return Math.PI*radius*radius;
           }
}
