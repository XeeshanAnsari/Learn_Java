package created;
import java.io.File;
public class Myfile {
	public static void main(String args[])
	{
		File x=new File("D:\\yest\\xeeshan.txt");
		if(x.exists())
			System.out.println(x.getName()+"existcs!");
		else
			System.out.println("Not exists");
		
	}

}
