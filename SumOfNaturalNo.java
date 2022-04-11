package online_class;
import java.util.*;
import java.util.Scanner;

public class SumOfNaturalNo {
	public void SumOfNaturalNo(int n) {
		System.out.println((n*(n+1))/2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		SumOfNaturalNo ab=new SumOfNaturalNo();
		System.out.println("enter no upto");
		int n=sc.nextInt();
		ab.SumOfNaturalNo(n);

	}

}
