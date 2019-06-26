package fundamentals;
import java.util.*;

public class fcs18 {
	 public static void main(String args[])
	 {
	  Scanner s=new Scanner(System.in);
	  System.out.println("Enter a number");
	  int n=s.nextInt();
	  int a,r,rev=0;
	  a=n;
	  while(a>0)
	  {
	   r=a%10;
	   rev=rev*10+r;
	   a=a/10;
	  }
	  if(rev==n)
	   System.out.println(n+" is a palindrome");
	  else
	   System.out.println(n+" is not a palindrome"); 
	 }

}
