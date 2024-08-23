package MyPackage;

import java.util.Arrays;
import java.util.Scanner;

public class LargestValuesInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the array index size");
		int arraySize = sc.nextInt();
		
		int arr[] = new int [arraySize];
		System.out.println("Please enter the array value");
		for (int i = 0; i < arraySize; i++) {
			arr[i]=sc.nextInt();
			
			
		}
		System.out.println("Input  :"+Arrays.toString(arr));
		int largestNumber = arr[0];
		int index =0;
		for (int i = 0; i < arr.length; i++) {
			if(largestNumber<arr[i])
			{
				largestNumber = arr[i];
				index =i;
			}
			
		}
		System.out.println("Largest Number  :"+largestNumber);
		System.out.println("Largest Number Index  :"+index);
        sc.close();

	}

}
