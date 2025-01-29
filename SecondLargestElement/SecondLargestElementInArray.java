package DataStructures;

public class SecondLargestElementInArray {

	
	public static void main(String[] args) {
		
		int[] arr= {2,5,1,9,6,7,3};
		
		int secondLargest=findSecondLargest(arr);
		System.out.println(secondLargest);
	}

	
	
	public static int findSecondLargest(int[] arr) {
		
	if(arr==null||arr.length<2)
	{
		throw new IllegalArgumentException("it should contains more than 2 elements");
	}
	
	int largest=Integer.MIN_VALUE;
	int secondLargest= Integer.MIN_VALUE;
	
	for(int num:arr)
	{
		if(num>largest)
		{
			//secondLargest=largest;
			largest=num;
		}
		
		else if(num>secondLargest&&num<largest)
		{
			secondLargest=num;
		}
	}
	
	if(secondLargest==Integer.MIN_VALUE)
	{
		throw new IllegalArgumentException("there is no second largest number");
	}
	
	return largest;
		
	}
}
