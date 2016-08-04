package static_method;
import java.util.Scanner;
public class main {
	public static void main(String ar[])
	{
		System.out.print("Enter anY NUmber   ");
		Scanner obj=new Scanner(System.in);
		int no=obj.nextInt();
		int squre=test.squre(no);
		System.out.println("squre is   "+squre);
		int cube=test.cube(no);
		System.out.println("cube is  "+cube);
		int fac=test.factorial(no);
		System.out.println("factorial is  "+fac);
	}

}
