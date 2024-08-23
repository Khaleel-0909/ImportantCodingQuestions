package MyPackage;

public class SwappingNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a =10;
		int b=20;
		
		System.out.println("Before swapping the number  a:"+a+ " , b:"+b);
		a= a+b; // 30
		b=a-b;//10
		a=a-b;//20
		
		System.out.println("After swapping the number  a:"+a+ " , b:"+b);
		
		
		// Second type
		int d = 10;
		int e = 25;
		int f ;
		System.out.println("Before swapping the number  a:"+d+ " , b:"+e);
		f=d;// d =25
		d=e;//e = 10;
		e=f;//f=10
		System.out.println("Before swapping the number  a:"+d+ " , b:"+e);
		
		
		

	}

}
