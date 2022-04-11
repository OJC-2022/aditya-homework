package online_class;
import java.util.*;
public class Rectangle_Area {
	public void Rectangle_Area(int l,int b) {
		System.out.println("The area is:" + l*b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Rectangle_Area ab=new Rectangle_Area();
			System.out.println("enter length:");
			int l=sc.nextInt();
			System.out.println("Enter breadth:");
			int b=sc.nextInt();
			ab.Rectangle_Area(l,b);
		

	}

}
