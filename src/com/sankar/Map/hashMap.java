package com.sankar.Map;

import java.util.*;

public class hashMap {
	public static void main(String[] args) {
		Map m=new HashMap();
		m.put("odia", 65);
		m.put("hindi",93);
		m.put("english",43);
		m.put("math", 88);
		m.put("hstory", 45);
		
		Set s=m.keySet();
		Iterator i=s.iterator();
		while(i.hasNext()) {
			Object key=i.next();
			Object value=m.get(key);
			System.out.println(key+"="+value);//It does not preserve insertion order. It will print randomly by hashCode.
		}
	}
}
