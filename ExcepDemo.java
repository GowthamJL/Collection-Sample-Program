import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class ExcepDemo {

	public static void main(String[] args) throws Exception {
		/*int z[]=new int[4];
try
{		
		for(int i=0;i<=4;i++)
		{
		    z[i]=i+1;
		    
		}
		for(int o :z)
		{
			System.out.println(o);
		}
}*/

		int a;
		int b,c;
		
		String str;
		BufferedReader br=null;
		try
		{
		br=new BufferedReader(new InputStreamReader(System.in));
		str=br.readLine();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		/*finally
		{
			br.close();
		}*/
		
		/*a=10;
		System.out.println("enter the number");
		try {
			b=Integer.parseInt(br.readLine());
		c=a/b;
		System.out.println(c);
		}
		catch (IOException e)
		{
			System.out.println("IO Exep"+e);
		}
		catch (ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("Bye");
		}*/
		}
	}


