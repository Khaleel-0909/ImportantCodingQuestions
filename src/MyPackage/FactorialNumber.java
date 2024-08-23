package MyPackage;
class Tester {
	public static void main(String[] args) {
		// Implement your code here 
		int number = 5;
		int factorial = 1;

		// Calculate factorial
		for (int i = 1; i <= number; i++) {
			factorial *= i;
		}

		// Print the result
		System.out.println("The factorial of " + number + " is: " + factorial);
	}
}




