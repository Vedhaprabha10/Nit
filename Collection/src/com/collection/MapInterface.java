package com.collection;
import java.util.*;
public class MapInterface {

	public static void main(String[] args) {
		Map<String,String> map = new HashMap<>();
		
		map.put("myName", "VEDHA");
		map.put("phone", "Redmi");
		map.put("Laptop", "Lenova");
		
		Set<String>keys =map.keySet();
		for (String key : keys)
		{
			System.out.println(key+"  "+map.get(key));
		}
	
	}
}
