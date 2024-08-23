package MyPackage;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter the given number");
		int input = sc.nextInt();
		System.out.println("Input :"+input);
                                             ;//It is the number variable to be checked for palindrome 
		int reverse=0;
		int sum=0;
		int temp;    
		temp=input;  
		
		
		while(input>0){    
			reverse=input%10;  //getting remainder  
			sum=(sum*10)+reverse;    
			input=input/10;    
		}    
		if(temp==sum)    
			System.out.println("palindrome number ");    
		else    
			System.out.println("not palindrome");  

	}

}
