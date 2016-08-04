package class_seven;
import java.util.Scanner;
public class class_seven {
	public static void main(String ar[])
	{
		Scanner obj=new Scanner(System.in);
		int roll;
		System.out.println("enter Roll Number  ");
		roll=obj.nextInt();
		switch (roll)
		{
			case 101:
		     	System.out.println("Student Name Is faHAd");
			    break;
			case 102:
				System.out.println("Student name iS Ali");
				break;
			case 103:
				System.out.println("StudeNt NAme iS Rehan");
				break;
			default:
				System.out.println("NOt FOund");
					
		}
		
	}

}
