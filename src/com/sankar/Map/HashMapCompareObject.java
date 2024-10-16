package com.sankar.Map;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;

public class HashMapCompareObject {
	public static void main(String[] args) {
		String s1="sankar";
		String s2=new String("sankar");
		System.out.println(s1==s2);
		Map m=new HashMap();
		m.put(s1,7);
		System.out.println(m.get(s2));//IdnetityHashMap() compare the keys using equals() method.
	}
}
