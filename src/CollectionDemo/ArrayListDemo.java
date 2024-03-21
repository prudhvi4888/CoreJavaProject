package CollectionDemo;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		//ArrayList, LinkedList and Vector implements List interface
		//Can accept duplicate values 
		//Arrays have fixed size where as ArrayList can grow dynamically and you can access
		//and insert any values in any index.
		
		ArrayList<String> names = new ArrayList<String>();
		names.add("dave");
		names.add("gosh");
		System.out.println(names);
		names.add(0, "Charlie");
		System.out.println(names);
		names.remove(0);
		System.out.println(names);
		System.out.println(names.contains("gosh"));
		System.out.println(names.indexOf("gosh"));
		System.out.println(names.isEmpty());
		System.out.println(names.size());
		
	}

}
