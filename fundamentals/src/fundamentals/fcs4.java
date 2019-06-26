package fundamentals;
import java.util.*;

public class fcs4 {
	public static void main(String args[])
	{
		char l1;
		char l2;
		Scanner sc=new Scanner(System.in);
		l1=sc.next().charAt(0);
		l2=sc.next().charAt(0);
		int ln1=Character.getNumericValue(l1);
		int ln2=Character.getNumericValue(l2);
		if(ln1<ln2) System.out.println(l1+","+l2);
		else System.out.println(l2+","+l1);
	}

}
