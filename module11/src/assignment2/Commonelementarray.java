package assignment2;

public class Commonelementarray {
	public static void main(String[] args) {
    int[]arr1={2,4,56,78,6,9};
    int[]arr2={5,3,45,67,2,4,90};
    for(int i=0;i<arr1.length;i++){
    	for(int j=0;j<arr2.length;j++){
    		if(arr1[i]==arr2[j]){
    			System.out.println(arr1[i]);
    			
    		}
    	}
    }
	}

}
