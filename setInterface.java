import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class setInterface {

	public static void main(String[] args) {
		// set not return the duplicate values
		//Set<Integer> values=new HashSet<Integer>(); //hashset have no sequence order
		Set<Integer> values=new TreeSet<Integer>();// treeset have acsen order
		values.add(94);
		values.add(10);
		values.add(92);
		values.add(15);
		values.add(94);
		for(int i:values)
		{
			System.out.println(i);
		}

	}

}
