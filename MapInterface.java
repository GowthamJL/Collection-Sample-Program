import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapInterface {

	public static void main(String[] args) {
Map<String , String> m1=new TreeMap<String, String>();
m1.put("Gowtham", "9791022352");
m1.put("Pappu", "9952020466");
m1.put("Lakshmi", "944417535");
	//System.out.println(m1.get("Gowtham"));
	
/*Set<String> s1= m1.keySet();
for(String i:s1)
{
	System.out.println(i +":"+ m1.get(i));
}*/

Set<Map.Entry<String, String>> s1=m1.entrySet();
for(Map.Entry<String,String> i:s1)
{
	System.out.println(i.getKey() +":" + i.getValue());
	i.setValue("123");
}
	}

}
