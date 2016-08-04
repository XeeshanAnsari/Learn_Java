package aligrah;
import javax.swing.*;

public class aligrah {
	public static void main(String ar[])

	{
		String fn=JOptionPane.showInputDialog("Enter First Number");
		String sn=JOptionPane.showInputDialog("Enter Secong Number");
		int num1=Integer.parseInt(fn);
		int num2=Integer.parseInt(sn);
		int sum=num1+num2;
		JOptionPane.showMessageDiolog(null,"the anser is "+sum,"the title",JOptionpane.PLAN_MESSAGE);
		
	}
	

}
