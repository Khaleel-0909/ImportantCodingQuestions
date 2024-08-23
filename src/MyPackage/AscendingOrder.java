package MyPackage;

import java.util.Arrays;
import java.util.Scanner;

public class AscendingOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the array size");
		int arraySize=sc.nextInt();
		
		
		
		int arr[] = new int[arraySize];
		System.out.println("please enter the input values");
		for (int i = 0; i < arraySize; i++) {
			arr[i] = sc.nextInt();
			
		}
		System.out.println("Input :"+Arrays.toString(arr));
		
		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
			
		}
		sc.close();


	}

}
