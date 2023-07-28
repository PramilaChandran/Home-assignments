package week2.day2;

import java.util.Arrays;

public class FindSecondLargerst {

	public static void main(String[] args) {

		int[] data = {3,2,11,4,6,7}; //Given Input
		// 2,3,4,6,7,11
		Arrays.sort(data);
		
		int length = data.length;
		
		System.out.println(data[length-2]);
		
		}

	}


