package online_class;
import java.util.*;

class Minimum{
public static int minimum (int x,int y)
{
	if(x>y)
	{
		return (y);
	} else
	return (x);
}
 public static void main(String[] args) {
 	int res = minimum(175,957);
    System.out.println(res);
}
}
