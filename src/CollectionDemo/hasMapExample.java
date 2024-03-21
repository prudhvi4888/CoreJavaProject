package CollectionDemo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class hasMapExample {

	public static void main(String[] args) {
		 
		
		HashMap<Integer, String>hm= new HashMap<Integer, String>();
		hm.put(0, "Dave");
		hm.put(2, "Dave");
		hm.put(42, "Dave");
		hm.put(22, "Dave");
		
		System.out.println(hm.get(41));
		System.out.println(hm.get(42));

		Set<Entry<Integer, String>> entrySet= hm.entrySet();
		
		for (Entry<Integer, String> entry : entrySet) {
            Integer key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + ": " + value);
            
              
            

	}

}
}