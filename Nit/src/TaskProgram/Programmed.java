package TaskProgram;

public class Programmed 
{
	Programmed()
	{
		System.out.println("I love Programming Language");
	}
	Programmed(String name)
	{
		System.out.println("I love "+name);
	}
	public static void main(String[] args) 
	{
		new Programmed();
		new Programmed("Java");
		 
	}

}
