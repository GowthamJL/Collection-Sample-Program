import sun.security.util.PropertyExpander.ExpandException;

class increment
{
	int count;
	public void increment()
	{
		count++;
	}
}
public class Demo1 {

	public static void main(String[] args) throws Exception {
		
		increment ss=new increment();
		Thread t1=new Thread(new Runnable()
				{
			public void run()
			{
				for(int i=1;i<=1000;i++)
				{
					ss.increment();
						}
			}
				});
		Thread t2=new Thread(new Runnable()
		{
	public void run()
	{
		for(int i=1;i<=1000;i++)
		{
			ss.increment();
				}
	}
		});
		t1.start();
		t2.start();
		t2.join();
System.out.println(ss.count);
	}

}
