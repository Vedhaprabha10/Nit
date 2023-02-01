package TaskProgram;

public class Staict_Block 
{
	final static int a;
	void meth1()
	{
		System.out.println("hi");
		//a=50;
	}
	static 
	{
		a=50;
		System.out.println("1st static block : "+a);
		
	}
	public static void main(String[] args) 
	{
		System.out.println("main () method "+a);
	}
	
	static {
		//a=100;
		System.out.println("2nd static method :"+a);
	}
}
