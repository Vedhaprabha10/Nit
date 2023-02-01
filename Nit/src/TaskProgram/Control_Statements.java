package TaskProgram;

public class Control_Statements 
{
	boolean meeth1(int a,int b,int c)
	{
		if(a>5) 
		{
			if(b<5)
			{
				if(c==5)
				{
					return true;
				}
				else
				{
					return false;
				}
			}
			else
				{
					return true;
				}
			}
				else {
					return false;
			}
	
		}
	
	public static void main(String[] args) 
	{
	
		System.out.println(new Control_Statements().meeth1('a'-50, 'A'-'B', 5));
	}

}
