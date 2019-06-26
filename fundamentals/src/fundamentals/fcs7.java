package fundamentals;
import java.util.*;

public class fcs7 {
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		char c=s.next().charAt(0);
		int a=(int)c;
		if(a>=65 && a<=90) 
			a=a+32;
		else
			a=a-32;
		
		System.out.println(c+"->"+(char)a);
	}

}
