package online_class;
import java.util.*;

class Minimum{
public static int minimum (int a,int b)
{
	if(a>b)
	{
		return b;
	} else
	return a;
}
 public static void main(String[] args) {
 	int res = minimum(175,957);
    System.out.println(res);
}
}
