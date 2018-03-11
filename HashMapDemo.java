package com.qa.Collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapDemo {

	public static void main(String[] args) {
		
		Map<Integer,String>hm = new HashMap<Integer,String>();
			hm.put(1, "Pleasanton");
			hm.put(2, "Fremont");
			hm.put(3, "Sunnyvale");
			hm.put(null, "Santa clara");
			for(Entry<Integer, String> hmEntry:hm.entrySet()){
				System.out.println("key::"+hmEntry.getKey()+"value::"+hmEntry.getValue());
			}
	}

}
