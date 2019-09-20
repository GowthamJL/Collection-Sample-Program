import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Govt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	List<Laptop> lap=new ArrayList<>();
	lap.add(new Laptop("Dell",32,128));
	lap.add(new Laptop("HP",64,32));
	lap.add(new Laptop("Acer",128,64));
/*	Comparator<Laptop> s1=new Comparator<Laptop>()
	{
		public int compare(int lap1, int lap2)
		{
		if(lap1.getram()>lap2)
		
		return 1;
		else
			return -1;
		}
	}*/
	//Collections.sort(lap);
	for(Object i:lap)
	{
		System.out.println(i);
	}
	
	}

}
