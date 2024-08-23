package MyPackage;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter the given string");
		 String input = sc.nextLine();
		 System.out.println("Input :"+input);
		 
		 String reverse ="";
		 for (int i = input.length()-1; i >=0 ; i--) {
			 reverse += input.charAt(i);
			
		}
		 System.out.println("output :"+reverse);

	}

}
