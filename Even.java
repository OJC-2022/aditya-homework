package online_class;
import java.util.*;

public class Even {
	public void check(int a) {
		if(a%2==0){
		    System.out.println("Even");
		}
		else{
		    System.out.println("Odd");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Even ab=new Even();
		 Scanner sc=new Scanner(System.in);
		    System.out.println("enter the no");
			int a=sc.nextInt();
			ab.check(a);
	}

}
