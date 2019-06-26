package fundamentals;
import java.util.*;
public class fcs15 {
	public static void main(String args[])
	 {
	  Scanner s=new Scanner(System.in);
	  System.out.println("Enter a number");
	  int n=s.nextInt();
	  int r,i,sum=0;
	  for(i=n;i>0;i=i/10)
	  {
	   r=i%10;
	   sum=sum+r;
	  }
	  System.out.println(n+"->"+sum);
	 }

}
