package fundamentals;
import java.util.*;

public class fcs14 {
	public static void main(String args[])
	 {
	  Scanner s=new Scanner(System.in);
	  System.out.println("Enter the number");
	  int n=s.nextInt();
	  int c=0;
	  if(n==0 || n==1)
	   System.out.println(n+" is neither prime nor composite");
	  else
	  {
	   for(int i=2;i<=n/2;i++)
	   {
	    if(n%i==0)
	     c++;
	   }
	   if(c==0)
	    System.out.println(n+" is a prime number");
	   else
	    System.out.println(n+" is not a prime number");
	  }
	 }

}
