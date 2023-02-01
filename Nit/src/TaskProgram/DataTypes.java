package TaskProgram;

public class DataTypes 
{
	int i;
	byte b;
	short s;
	long l;
	
	char c;			//the char defualt value is /u0000
	boolean flag;
	
	float f;
	double d;
	
	void  meth1()
	{
		System.out.println("int default value:"+i);
		System.out.println("byte default value:"+b);
		System.out.println("short default value:"+s);
		System.out.println("long default value:"+l);
		
		System.out.println("char default value:"+c);
		System.out.println("boolean default value:"+flag);
		
		System.out.println("float default value:"+f);
		System.out.println("double default value:"+d);
		
	}
	void meth2()
	{
		int i1=10;
		int i2=20;
		int i3=i1+i2;
		System.out.println("i3 value is :"+i3);
		
		byte b1=10;
		byte b2=10;
		byte b3=(byte)(b1+b2);	//10+10=20 20 is int value performing explict type casting
		System.out.println("b3 value is :"+b3);

		float f=10.9f;
		System.out.println("float value is :"+f);
		
		long x=2147483648l;
		System.out.println("long value is :"+x);
		/*every number in java is by default considered as 'int' by the compiler
		 *every decimal values is by default considered as 'double' by the complier 
		 */
	}

	public static void main(String[] agrs) 
	{
		DataTypes aobj=new DataTypes();
		aobj.meth1();
		aobj.meth2();
	}

}
