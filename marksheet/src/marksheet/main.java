package marksheet;

import java.util.Scanner;

public class main {
	
	public static void main(String args[])
	{
		int ma,eng,ur,com,phy;
		Scanner obj=new Scanner(System.in);
		System.out.print("Enter Math MArks       ");
		ma=obj.nextInt();
		System.out.print("Enter English MArks    ");
		eng=obj.nextInt();
		System.out.print("Enter urdu MArks       ");
		ur=obj.nextInt();
		System.out.print("Enter computer MArks   ");
		com=obj.nextInt();
		System.out.print("Enter physic MArks     ");
		phy=obj.nextInt();
		c next=new c();
		next.getdata(ma,eng,ur,com,phy);
		next.obtain();
		next.percntage();
		next.grate();
		
	}

}
