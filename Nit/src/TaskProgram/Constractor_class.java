package TaskProgram;

public class Constractor_class 
{
	Constractor_class()				//==>non-parameterizied constractor (or) defualt constractor
	{
		System.out.println("hi");
	}
	Constractor_class(int x)		//==> parameterizied constractor
	{
		System.out.println("x value is : "+x);
	}
	Constractor_class(int a, String name)	//==>parameterizied constractor
	{
		System.out.println("a value is : "+a+"-"+name);
	
	}
	public static void main(String[] args) 
	{
		new Constractor_class();	
		new Constractor_class(100);			//x=100
		new Constractor_class(292,"prabha");	//a=292 , name=prabha
		new Constractor_class(401,"vedha");

	}

}
