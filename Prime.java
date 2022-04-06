package online_class;
import java.util.*;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no to check prime or not");
		int a=sc.nextInt();
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

}
