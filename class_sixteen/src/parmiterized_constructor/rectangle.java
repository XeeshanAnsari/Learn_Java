package parmiterized_constructor;

public class rectangle {
	int length,width,res;
	rectangle(int x,int y)
	{
		length=x;
		width=y;
	}
	void rectArea()
	{
		res=length*width;
		System.out.println("Area Of REctangle   "+res);
	}
	

}
