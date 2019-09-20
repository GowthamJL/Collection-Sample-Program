
class A /*extends Thread*/ implements Runnable
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
		System.out.println("hi");
		try {Thread.sleep(1000);} catch (Exception e){}
	}
	}
}
class B /*extends Thread*/ implements Runnable
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
	System.out.println("Hello");
try {Thread.sleep(1000);} catch (Exception e){}
}}}
public class DemoTheard {

	public static void main(String[] args) throws Exception {
		Runnable a=new A();
		Runnable b=new B();
		Thread t1=new Thread(a);
		Thread t2=new Thread(b);
		t1.setName("Thread 1");
		t2.setPriority(10);
		System.out.println(t1.getName());
		System.out.println(t2.getPriority());
		t1.start();
		try {Thread.sleep(500);} catch (Exception e){}
		t2.start();
		System.out.println(t1.isAlive());
		t2.join();
		System.out.println(t1.isAlive());
		System.out.println("Bye");

	}

}
