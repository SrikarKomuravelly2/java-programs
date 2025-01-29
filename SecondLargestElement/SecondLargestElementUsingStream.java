package DataStructures;

import java.util.Arrays;
import java.util.Optional;
import java.util.OptionalInt;

public class SecondLargestElementUsingStream {
	
	public static void main(String[] args) {
		
		int[] arr= {2,5,1,9,6,7,3};
		
		OptionalInt secondLargest=findSecondLargest(arr);
		System.out.println(secondLargest);
	}

	public  static OptionalInt findSecondLargest(int[] arr) {
		
		OptionalInt result=Arrays.stream(arr).distinct().sorted().skip(arr.length-2).findFirst();
		return result;
	}

}
