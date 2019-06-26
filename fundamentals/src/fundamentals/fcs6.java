package fundamentals;
import java.util.Scanner;

public class fcs6 {
	public static void main(String args[])
	 {
	  Scanner s=new Scanner(System.in);
	  System.out.println("Enter the Gender");
	  String str=s.nextLine();
	  System.out.println("Enter the age");
	  int n=s.nextInt();
	  if(str.equals("Male") && n>=1 && n<=60)
	   System.out.println("Interest=9.2%");
	  else if(str.equals("Male") && n>=61 && n<=120)
	   System.out.println("Interest=8.3%");
	  else if(str.equals("Female") && n>=1 && n<=58)
	   System.out.println("Interest=8.2%");
	  else if(str.equals("Female") && n>=59 && n<=120)
	   System.out.println("Interest=7.6%");
	 }

}
