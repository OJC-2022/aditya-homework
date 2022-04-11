package online_class;
import java.util.*;

public class DivisibleBY7 {
	public static void check7(int x) {
		if(x%7==0) {
			System.out.println("YES");
		}
		else
			System.out.println("NO");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ab=new Scanner(System.in);
		System.out.println("Enter the no");
		int a=ab.nextInt();
		check7(a);
		

	}

}
