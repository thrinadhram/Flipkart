package Listandset;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class List {

	public static void main(String[] args) {
	Set<String>list = new TreeSet<String>();
	System.out.println(list.isEmpty());
	System.out.println(list.size());
	list.add("pooja");
	list.add("prasad");
	list.add("neeha");
	list.add("hithika");
	System.out.println(list.isEmpty());
	System.out.println(list.size());
	list.remove("prasad");
	System.out.println(list);
	list.add("santhosh");
	System.out.println(list);
	list.contains("prasad");
	System.out.println(list);
	}

}
