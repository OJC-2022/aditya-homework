package online_class;
import java.util.*;


public class LCM_HCF {
	public void LCM(int a,int b){
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

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LCM_HCF ab=new LCM_HCF();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first no:");;
		int a=sc.nextInt();
		System.out.println("enter second no:");
		int b=sc.nextInt();
		ab.LCM(a, b);
	}

}
