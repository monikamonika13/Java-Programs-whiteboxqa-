package Assignment3;

public class StringReverse {
	public String reverse(String s){
		int j=0;
		char[]array1= s.toCharArray();
		int l= array1.length;
		 char[]array2= new char[l];
		 for(int i=l-1;i>=0;i--){
			 array2[j]=array1[i];
			 j++;
		 }
		 String s1= new String(array2);
		return s1;
	}

	public static void main(String[] args) {
		StringReverse R= new StringReverse();
		String s3=R.reverse("Monika");
		System.out.println(s3);
	}

}
