package week2.day2;

import java.util.Arrays;

public class PrintDuplicatesInArray {

	public static void main(String[] args) {
				
				int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
				
				int length=arr.length; // get the length of the array
				//int count=0; // declare an int variable named count & assign 0 to count
				Arrays.sort(arr);
				
				for (int i = 0; i < length-1; i++) {
					
					for (int j = i+1; j < arr.length; j++) {
						
										
					if (arr[i]==arr[j]) {
						
						System.out.println(arr[i]);
						
					}
					
				}
	}
	}
}
	