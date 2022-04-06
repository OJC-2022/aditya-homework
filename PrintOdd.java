package online_class;
import java.util.*;

public class PrintOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no of terms:");
		int a=sc.nextInt();
		int i=1;
		int b=1;
		while(i<=a) {
			System.out.println(b);
			b+=2;
			i++;
		}

	}

}
