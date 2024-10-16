package com.sankar.Map;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class linkedHashMap {
	public static void main(String[] args) {
		Map m=new LinkedHashMap();
		m.put("odia",65);
		m.put("hindi",93);
		m.put("english",43);
		m.put("math",83);
		m.put("science",45);
		
		Set s=m.keySet();
		Iterator i=s.iterator();
		while(i.hasNext()) {
			Object key=i.next();
			Object value=m.get(key);
			System.out.println(key+"="+value);
		}
	}
}
