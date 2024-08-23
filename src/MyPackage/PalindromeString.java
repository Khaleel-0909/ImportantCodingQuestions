package MyPackage;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the input String");
		String input = sc.nextLine();
		System.out.println("Input :"+input);
		
		String outputStr="";
		if (getReverseString(input).equals(input)) {
			outputStr = "The given string is palindrome";
			
			
		} else {
			outputStr = "The given string is not palindrome";
			

		}
			
		
		System.out.println("outPut :"+outputStr);
		sc.close();

	}
	private static String getReverseString(String inputString) {
		String reverse="";
		for (int j = inputString.length()-1; j>= 0; j--) {
			reverse +=inputString.charAt(j);
			
			
		}
		return reverse;

	}

}
