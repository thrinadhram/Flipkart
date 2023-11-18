package Listandset;

import java.util.HashMap;

public class Map {

	public static void main(String[] args) {
		java.util.Map<String,String> map = new HashMap<String, String>();
		System.out.println(map.isEmpty());
System.out.println(map.size());
map.put("poojitha","Tea");
map.put("prasad","chai");
System.out.println(map.isEmpty());
System.out.println(map.size());
System.out.println(map.containsKey("prasad"));
System.out.println(map.containsValue("chai"));

System.out.println(map.containsKey("poojitha"));
System.out.println(map.containsValue("Tea"));
System.out.println(map.remove("prasad"));
System.out.println(map.remove("poojitha"));
System.out.println();
	}

}
