package online_class;
import java.util.*;

public class Fibonacci {
	public void fib(int n) {
		int ans=0;
		int a=0;
		int b=1;
		System.out.print(a+" ");
		System.out.print(b+" ");
		for(int i=0;i<n-2;i++) {
			ans=a+b;
			System.out.print(ans+" ");
			a=b;
			b=ans;
	}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fibonacci ab=new Fibonacci();
		Scanner sc=new Scanner(System.in);
		
		int n;
		System.out.println("enter no of terms");
		n=sc.nextInt();
		ab.fib(n);
		}

	}


