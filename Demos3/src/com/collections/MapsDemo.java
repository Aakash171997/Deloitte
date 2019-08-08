package com.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

@SuppressWarnings("unused")
public class MapsDemo {

	public static void main(String[] args) {
		Map<Integer, String> data = new TreeMap<Integer, String>();
		
		data.put(9871, "Anwesh");
		data.put(8691, "Anjan");
		data.put(8681, "Vernon");
		data.put(9971, "Randal");
		data.put(9675, "Ross");
		
		Set<Integer> keys = data.keySet();;
		
		Iterator<Integer> iterator = keys.iterator();
		
		System.out.println("ID  \tName");
		
		while(iterator.hasNext()) {
			int key = iterator.next();
			System.out.println(key+"\t"+data.get(key));
		}

	}

}
