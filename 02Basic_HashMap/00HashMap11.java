import java.util.Map;
import java.util.HashMap;

public class HashMap
{
	public static void main(String[] args) {
	    Map<Integer, String> map = new HashMap<>();
	    map.put(65,"Mridu");
	    map.put(67,"Adrima");
	    map.put(66,"Sourav");

	    map.put(66,"Sourav Roy"); // Key will not duplicate, if it happens new value will Override

		System.out.println(map);

		String value = map.get(66);
		System.out.println(value);

		map.remove(66);
		System.out.println(map);

		map.clear();
		System.out.println(map);
	}
}
