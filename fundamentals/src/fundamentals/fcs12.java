package fundamentals;
import java.util.*;


public class fcs12 {
	public static void main(String args[])
	 {
	  Scanner s=new Scanner(System.in);
	  System.out.println("Enter the number");
	  int n=s.nextInt();
	  int c=0;
	  for(int i=2;i<=n/2;i++)
	  {
	   if(n%i==0)
	    c++;
	  }
	  if(c==0)
	   System.out.println("Prime number");
	  else
	   System.out.println("Not a prime number");
	 }

}
