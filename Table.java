package online_class;
import java.util.*;
import java.util.Scanner;

public class Table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enetr first no:");;
		int a=sc.nextInt();
		System.out.println("enter second no:");
		int b=sc.nextInt();
		int i=1;
		while(i<=a) {
			System.out.println(i*b);
			i++;
		}

	}

}
