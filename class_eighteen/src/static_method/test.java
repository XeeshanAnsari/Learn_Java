package static_method;

public class test {
	static int cube(int x)
	{
		return(x*x*x);
	}
    static int squre(int y)
    {
    	return(y*y);
    }
    static int factorial(int z)
    {
    	int c=1;
    	for(int i=0; i<=z; i++)
    	{  
    		c=z*c;
    		z--;
    	}
    	return(c);
    }
}
