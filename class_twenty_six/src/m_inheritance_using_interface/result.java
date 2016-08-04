package m_inheritance_using_interface;

public class result extends student implements sport {
	public void spmark()
	{
		System.out.println("sport mark  "+sp);
	}
	void disp()
	{
		putmark();
		spmark();
		int total=m1+m2+sp;
		System.out.println("total mark "+total);
		}

}
