package assignment2;

public class Sort2no {
	public void sorting(int[]arr1){
		int n=0,i,j,temp;
		n=arr1.length;
		for(i=n-1;i>0;i--){
			if(arr1[i]<arr1[i-1]){
				j=i-1;
				 temp=arr1[i];
  		       arr1[i]=arr1[j];
  		       arr1[j]=temp;
				
			}}
			for(i=0;i<n;i++){
				System.out.println(arr1[i]);
			}
		}
	
public static void main(String[] args) {
		Sort2no  s= new Sort2no();
		int[]arr= {1,2,5,6,4};
		s.sorting(arr);
		
}
}