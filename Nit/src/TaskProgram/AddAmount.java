package TaskProgram;

public class AddAmount 
{	int amount=500;
 AddAmount()
 {
	 System.out.println("balance is : "+amount);
 }
 AddAmount(int deposit)
 {
	 System.out.println("updated balance is : "+deposit);
 }
	public static void main(String[] args) 
	{
	new AddAmount();
	new AddAmount((10-50+90-4-4+4+4));

	}

}
