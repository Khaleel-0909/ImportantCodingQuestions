package MyPackage;

import java.util.Scanner;

public class CountNumberOfWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the given input");
		String input =sc.nextLine();
		System.out.println("Input :"+input);
		String[] words =input.split(" ");
		System.out.println("Output :"+words.length);
		
		/*
		 * int op=words.length; System.out.println(op);
		 */
		sc.close();

	}

}
