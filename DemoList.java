import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class DemoList {

	public static void main(String[] args) {
		//List<Integer> values=new ArrayList<Integer>();
		Vector<Integer> values=new Vector();
		values.add(10);
		values.add(5);
		values.add(55);
		values.add(7);
		values.add(1,100);
		//values.remove(2);
		System.out.println(values.capacity());
		Collections.sort(values);
		values.forEach(System.out::println);

	}

}
