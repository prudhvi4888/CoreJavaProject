package CollectionDemo;

import java.util.HashSet;
import java.util.Iterator;

public class hashSetDemo {

	public static void main(String[] args) {

		// Hashset, Treeset, LinkedHashset implements Set Interface
		// Hashset does not accept duplicate values and the order of the elements is not
		// guaranteed

		HashSet<String> names = new HashSet<String>();
		names.add("Gosh");
		names.add("nancy");
		names.add("rando");
		names.add("Gosh");

		System.out.println(names);

		Iterator<String> it = names.iterator();

		System.out.println(it.next());

		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
