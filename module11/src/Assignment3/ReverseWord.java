package Assignment3;

public class ReverseWord {
	  public String reverse(String s1){
		  int j=0;
		  String[]split= s1.split(" ");
		 int L= split.length;
		 String[]result= new String[L];
		  for(int i=L-1;i>=0;i--){
			  result[j]= split[i];
			  j++;
		  }
		   String result1= result[0]+" "+result[1]+" "+result[2];
		  
		  return result1;
	  }

	public static void main(String[] args) {
		 ReverseWord R=new ReverseWord ();
		 String s2= R.reverse("This is Nice");
		     System.out.println(s2);
	}

}
