package week2.day2;

import java.util.Arrays;

public class MissingElementInArray {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,7,6,8}; //Given Input
		
		Arrays.sort(arr); // Sort the array	

		int total1=0;
		
		for(int i=0;i<=arr.length-1;i++) 
		{
			total1=total1+arr[i];

		}

		System.out.println("Total of elements in Array is: "  +total1);
	
	int total2=0;
	
	for(int i=1;i<=8;i++) 
	{
		total2=total2+i;
		
	}
       System.out.println("Total range of Elements: " +total2);

       System.out.println("Missing Element in Array:" + (total2-total1));

	}
}
