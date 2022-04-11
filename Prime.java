package online_class;
import java.util.*;

public class Prime {

	public void Prime1(int a) {
		for(int i=2;i<a/2;i++) {
			if(a%i==0) {
				System.out.println("not prime");
				break;
			}
			else
				System.out.println("prime");
				break;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Prime ab=new Prime();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no to check prime or not");
		int a=sc.nextInt();
		ab.Prime1(a);
		

	}

}
