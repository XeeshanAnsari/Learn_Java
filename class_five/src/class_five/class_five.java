package class_five;
import java.util.Scanner;
public class class_five {
	public static void main(String ar[])
	{
		Scanner obj=new Scanner(System.in);
		int a;
		int b;
		int c;
		System.out.println("Enter First NUmber");
		a=obj.nextInt();
		System.out.println("Enter Second NUmber");
		b=obj.nextInt();
		System.out.println("Enter Third Number");
		c=obj.nextInt();
		
		if(a>b)
		{
			if (a>c)
			{
				System.out.println("Greater VAlue is first   "+a);
			}
			else
			{
				System.out.println("Greater Value iS third   "+c);
			}
		}
		else if(b>a)
		{
			if(b>c)
			{
				System.out.println("Greater valUe iS second   "+b);
			}
		
		else
		    {
		     	System.out.println("Greter value iS  third   "+c);
		    }
	    } 
  }
}
