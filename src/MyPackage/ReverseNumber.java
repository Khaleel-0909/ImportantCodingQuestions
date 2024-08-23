package MyPackage;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter the given number");
		int input = sc.nextInt();
		System.out.println("Input :"+input);

		int reverse =0;



		while (input>0) {
			reverse=input%10;
			System.out.print(reverse);
			input = input/10;

		}



	}
}


