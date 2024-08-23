package MyPackage;

public class AmstrongNumber {// It's a number that equals the sum of its digits, each raised to a power. {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * //Divide num with 10; 
		 * //take the remainder 
		 * mutiple rem 3 times add this rem
		 * to any variable take the quotient value
		 */
		
		int num=153;
		int onum=num;
		int rem =0;
		int arm=0;
		
		while (num>0) {
			rem = rem%10;
			arm =arm+(rem*rem*rem);
			num = num/10;
			
		}
		if(onum==arm) {
			System.out.println("Armstrong number");
		}
		else {
			System.out.println("not armstrong number");
		}
		
		
		
		

	}

}
