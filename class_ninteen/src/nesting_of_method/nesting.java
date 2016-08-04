package nesting_of_method;

public class nesting {
	int m,n;
	nesting(int x,int y)
	{
		m=x;
		n=y;
	}
	int larger()
	{
		if(m>n)
		{
			return(m);
		}
		else
		{
			return(n);
		}
	}
	void disp()
	{
		int ans=larger();
System.out.println("Larger value of    "+ans);
	}

}
