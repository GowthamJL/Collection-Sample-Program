import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class Linkedlist {

	public static void main(String[] args) {
		List <Integer> list=new ArrayList<Integer>();
		list.add(519);
		list.add(103);
		list.add(108);
		list.add(444);
		Comparator<Integer> comp=new com();
		
			Collections.sort(list, comp);
			
			for(int i: list)
			{
				System.out.println(i);
				
			}
			
	
	}
}
