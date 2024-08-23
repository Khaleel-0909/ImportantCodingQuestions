package MyPackage;

public class FibinocciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//. Each number is equal to the sum of the preceding two numbers
		int n1=0,n2=1,n3,i;
		System.out.println(n1 +""+ n2);
		for(i=2;i<=10;++i) {
			n3=n1+n2;
			System.out.println(""+n3);
			n1=n2;
			n2=n3;

		}

	}
}
