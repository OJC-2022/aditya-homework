package online_class;
import java.util.*;
public class PrintOdd {

	public void PrintOdd(int n) {
		while(n>1) {
			System.out.println(n);
			n-=2;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		PrintOdd ab =new PrintOdd();
		System.out.println("enter term");
		int n=sc.nextInt();
		if(n%2!=0) {
		ab.PrintOdd(n);
	}
		else {
			n=n-1;
			ab.PrintOdd(n);
		}
	}
}
