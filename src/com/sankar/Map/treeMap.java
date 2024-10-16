package com.sankar.Map;

import java.util.*;

public class treeMap {
	public static void main(String[] args) {
		Map m=new TreeMap();
		m.put("odia",76);
		m.put("hindi",93);
		m.put("english",64);
		m.put("math",86);
		m.put("science",46);
		
		System.out.println(m.containsKey("odia"));//here search the key is present or not if yes return true otherwise false
		
		Set s=m.keySet();
		Iterator i=s.iterator();
		while(i.hasNext()) {
			Object key=i.next();
			Object value=m.get(key);
			System.out.println(key+"="+value);
		}
	}
}
