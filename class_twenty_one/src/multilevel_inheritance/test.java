package multilevel_inheritance;

public class test extends student {
	int m1,m2;
	void getmark(int x, int y)
	{
		m1=x;
		m2=y;
	}
	void putmark()
	{
		System.out.println("test1 is "+m1);
		System.out.println("test2 is "+m2);
	}

}
