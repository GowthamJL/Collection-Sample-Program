import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Stundent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 List<Details> ss =new ArrayList<>();
 //ss.add(new Details(1,10));
 //ss.add(new Details(2,50));
 //ss.add(new Details(3,75));
 for(Details i:ss)
 {
	 System.out.print(i);
 }
 
	}

	class Details
	{
		int rollno;
		int marks;
		public Details(int rollno, int marks) {
			this.rollno = rollno;
			this.marks = marks;
		}
		
	}
}
