package one_dimensinoal;
import java.util.Scanner;
public class main {
	public static void main(String args[])
	{
		Scanner obj=new Scanner(System.in);
		System.out.print("Enter Size  ");
		int n=obj.nextInt();
		int mark[]=new int[n];
		System.out.println("Array length   "+mark.length);
		System.out.println("EnteR  "+n+"  Element");
		
		for (int i=0;  i<mark.length; i++)
		{
			mark[i]=obj.nextInt();
		}
		    int total=0;
			System.out.println("Element  Are");
			for (int i=0;  i<=mark.length; i++)
			{
				System.out.println(mark[i]);
				total=total+mark[i];
			}
			System.out.println("total is "+total);	
	}
}
