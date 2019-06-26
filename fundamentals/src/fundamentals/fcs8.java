package fundamentals;
import java.util.*;

public class fcs8 {
	public static void main(String args[])
	 {
	  Scanner s=new Scanner(System.in);
	  System.out.println("Enter the colour code");
	  char c=s.next().charAt(0);
	  switch(c)
	  {
	   case 'R':System.out.println("Red");
	            break;
	   case 'Y':System.out.println("Yellow");
	            break;
	   case 'G':System.out.println("Green");
	            break;
	   case 'B':System.out.println("Blue");
	            break;
	   case 'O':System.out.println("Orange");
	            break;
	   case 'W':System.out.println("White");
	            break;
	   default:System.out.println("Invalid Code");
	           break;
	  }
	 }

}
