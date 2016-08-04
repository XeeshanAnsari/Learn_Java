package class_thirteen;

public class labeled_loop {
	public static void main(String ar[])
	{
	loop1: for(int i=1; i<=10; i++)
		{
			System.out.println(" ");
			if(i==5)
			{
				break;
			}
			for(int j=1; j<=5; j++)
			{
				System.out.print("*");
				if(i==j)
				{
					continue loop1;
				}
			}
		}
	}

}
