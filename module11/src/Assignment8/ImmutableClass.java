package Assignment8;

public class ImmutableClass {
	private String name;
    private String age;
    public ImmutableClass(String name,String age){
    	this.name=name;
    	this.age=age;}
    	public String getName(){
    		return name;
    	}
		
		public String getAge(){
			return age;
		}
	
	
	

	public static void main(String[] args) {
		ImmutableClass IM=new ImmutableClass("MONIKA","ThirtyFive");
			System.out.println("Name is"+" " +IM.name +" "+"age is "+IM.age);	
	}

}
