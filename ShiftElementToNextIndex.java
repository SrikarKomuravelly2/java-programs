package DataStructures;

public class ShiftElementToNextIndex {
	
	public static void main(String[] args) {
		
		int[] arr= {1,2,3,4,5,6,7};
		
		
		
		shiftToNextIndex(arr);
	}

	private static void shiftToNextIndex(int[] arr) {
		
		int lastElement= arr[arr.length-1];
		
		for(int i=arr.length-2;i>=0;i--)
		{
			arr[i+1]=arr[i];
		}
		
		arr[0]=lastElement;
		
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println(arr[i]);
		}
		
	}
	
	

}
