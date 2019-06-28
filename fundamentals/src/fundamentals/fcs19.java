package fundamentals;

public class fcs19 {
	 public static void main(String args[])
	 {
	  int c=0;
	  int a=5;
	  while(c!=5)
	  {
	   if(a%2==0 && a%3==0 && a%5==0)
	   {
	    c++;
	    System.out.println(a);
	   }
	   a=a+5;
	  }
	 }

}
