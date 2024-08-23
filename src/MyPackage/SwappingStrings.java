package MyPackage;

public class SwappingStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="hello";
		String s2 = "world";
		String s3 ="";
		s3=s1;
		s1=s2;
		s2=s3;
		
		System.out.print(s2);
		System.out.print(s1);
		
		//Using Substring
		s1=s1+s2;
		s2=s1.substring(0,s1.length()-s2.length());
		s1=s1.substring(s2.length());
		System.out.print(s1);
		System.out.print(s2);

	}

}
