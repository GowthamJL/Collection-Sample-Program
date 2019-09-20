
public class Demo {

	public static void main(String[] args) {
		int a=1;
		int b=11;
		int c=a+b;
		try
		{
		if(c>10)
		{
			throw new ArithmeticException();
		}
		}
catch (ArithmeticException e)
		{
	System.out.println("Null"+e);
		}
		
	}

}
