package task3;

public class tas3 {
	public static void main(String ar[])
	{
	int a=8;
	int b=1;
	for(int i=8; i>1;  i--)
	{ 
		a--;
		for(int s=1; s<a; s++)
		{
		System .out.print(" ");
		
		}
		
		for(int j=0; j<b; j++)
		{
		System .out.print("*");
		
		}
		b=b+2;
		
		System.out.println(" ");
	
	}	
	for(int i=8; i>1;  i--)
	{ 
		for(int s=1; s<a; s++)
		{
		System .out.print(" ");
		}
		a++;
		b=b-2;
		for(int j=0; j<b; j++)
		{
		System .out.print("*");
		
		}
		System.out.println(" ");
	
	}

	}
}
