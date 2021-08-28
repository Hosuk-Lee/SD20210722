package Question_SD;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapTest {
	public static void main(String[] args) {
		Map map = new HashMap<>();
		
		map.put("A", 1);
		map.put("B", 2);
		map.put("C", 3);
		map.put("D", 4);
		
		Iterator it = map.keySet().iterator();
		
		while (it.hasNext()) {
			// type type = (// type) en.nextElement();
			// System.out.println(it.next());
			System.out.println(map.get( (String) it.next() )); 
			
		}
		
		
	}
}
