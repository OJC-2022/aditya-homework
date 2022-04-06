package online_class;
import java.util.*;


public class LCM_HCF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enetr first no:");;
		int a=sc.nextInt();
		System.out.println("enter second no:");
		int b=sc.nextInt();
		int x=a,y=b;
		while(b!=0) {
			if(a>b) {
				a=a-b;
			}
			else {
				b=b-a;
			}
			
		}
		System.out.println("the HCF is: "+ a);
		System.out.println("the lcm is: "+ (x*y)/a);
	}

}
