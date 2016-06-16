package assignment2;

public class LargestNoInArray {
	
	int largest(int[]arr)
	{
	
		int max= arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(max<arr[i])
			{
				max= arr[i];
			}
	    }
		return max;
    }
	
	public static void main(String[] args) {
		int[]arr1= {6,8,9,67,42};
		LargestNoInArray ex= new LargestNoInArray();
		int a = ex.largest(arr1);
		System.out.println(a);
		
	}

}
