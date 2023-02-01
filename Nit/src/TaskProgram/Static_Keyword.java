package TaskProgram;

public class Static_Keyword 
{	
		int a;		//instance variable ==> for every instance variable separate copy  will be create.
		static int b;	//static variable (or) class variable (It is not constant)
		Static_Keyword()
		{
			a++;
			b++;
			System.out.println("a value :"+a);
			System.out.println("b value :"+b);
		}
		
		 
		public static void main(String[] args) 
		{
			new Static_Keyword ();
			System.out.println("--------------------");
			new Static_Keyword();
			System.out.println("--------------------");
			new Static_Keyword();
			System.out.println("--------------------");
			new Static_Keyword();
			
			
			
		}
		
}
