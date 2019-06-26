package fundamentals;

public class fcs1 {
	public static void main(String args[])
	{
		int length=args.length;
		if(length==0)
		{
			System.out.println("No values");
		}
		else
		{
			for(int i=0;i<length-1;i++)
			{
				System.out.print(args[i]+",");
				
			}
			System.out.println(args[length-1]);
		}


	}
}
