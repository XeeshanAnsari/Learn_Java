package class_six;
import java.util.Scanner;
public class class_six {
	public static void main(String ar[])
	{
		Scanner obj=new Scanner(System.in);
		char grade;
		int marks;
		System.out.println("Enter Your Marks");
		marks=obj.nextInt();
		if(marks>=85)
		{
			grade='A';
		}
		else if(marks>=75)
		{
			grade='b';
		}
		else if(marks>=65)
		{
			grade='C';
		}
		else
		{
			grade='D';
		}
		System.out.println("Your Grade Is    "+grade);
	}

}
