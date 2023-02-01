package TaskProgram;

public class Task_nit {


	public static void main(String[] args) {
		int a=34;
		int b=21;
		int c=a++ + ++b;		//cv=56			cp=57
		int d=--a+ --b +c--;	//dv=111			dp=111
		int e=a+ +b+ +c+ d--;	//34+21+55+111=222=e
		int f=-a+ b-- + -c-d++;//(-34+21)+(-55-110)=178=f
		int sum=a+b+c+d+e+f;	//sum=34+19+
		
		System.out.println("Sum = "+sum);
		System.out.println("c = "+c);
		System.out.println("d = "+d);
		System.out.println("e = "+e);
		System.out.println("f = "+f);
		
	}

	
}
