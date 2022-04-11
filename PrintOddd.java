package online_class;
import java.util.*;
import java.util.Scanner;

public class PrintOddd {
	public void PrintOddd(int a,int b){
		while(a<b) {
			if(a%2!=0) {
			System.out.println(a);
			a+=2;
			}
			else {
				a+=1;
			}
		
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		PrintOddd ab=new PrintOddd();
		System.out.println("enetr first no:");;
		int a=sc.nextInt();
		System.out.println("enter second no:");
		int b=sc.nextInt();
		ab.PrintOddd(a,b);
		

	}

}
