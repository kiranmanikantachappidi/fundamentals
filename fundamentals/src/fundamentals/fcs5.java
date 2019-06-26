package fundamentals;
import java.util.*;

public class fcs5 {
	public static void main(String args[])
	{
		char c;
		Scanner sc=new Scanner(System.in);
		c=sc.next().charAt(0);
		int a=(int)c;
		if(((a>=65)&&(a<=90))||((a>=97)&&(a<=122))) System.out.println("Alphabet");
		else if((a>=48)&&(a<=57)) System.out.println("Digit");
		else System.out.println("Special Character");
	}

}
