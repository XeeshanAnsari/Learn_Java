package method_overloading;

public class test {
	
	int a,b;
	void calc(int x)
	{
		a=x;
		System.out.println("square Is  "+(a*a));
		
	}
	void calc(int x,int y)
	{
		a=x;
		b=y;
		System.out.println("addition Is  "+(a+b));
	}
	

}
