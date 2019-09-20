import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class Demo {

	public static void main(String[] args) {
		//int values[]=new int[4];
		//Object values[]=new Object[5];
		//values[0]="Gowtham";
		//values[1]=1;
		Collection<Object> values=new ArrayList<Object>();
		values.add(1);
		values.add("Gowtham");
		values.add(20);
		values.add(5);
		
		/*Iterator i= values.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}*/
	
		/*for(Object i:values)
		{
			System.out.println(i);
		}*/
	values.forEach(System.out::println);
	}
	
	

}
