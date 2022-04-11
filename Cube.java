package online_class;
import java.util.*;
//import java.util.scanner; 



public class Cube {
	
	public static int nextCube(int num) {
		
		return num*num*num;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no");
		int a=sc.nextInt();
		int Cube;
		Cube=nextCube(a);
		System.out.println(Cube);
	}

	
}
