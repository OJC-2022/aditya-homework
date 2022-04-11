package online_class;
import java.util.*;
public class PrintEven {

	public void PrintEven(int n) {
		while(n>1) {
			System.out.println(n);
			n-=2;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		PrintEven ab =new PrintEven();
		System.out.println("enter term");
		int n=sc.nextInt();
		if(n%2==0) {
		ab.PrintEven(n);
	}
		else {
			n=n-1;
			ab.PrintEven(n);
		}
	}
}
