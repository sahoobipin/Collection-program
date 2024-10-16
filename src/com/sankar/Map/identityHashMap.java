package com.sankar.Map;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;

public class identityHashMap {
	public static void main(String[] args) {
		String s1=new String("sankar");
		String s2=new String("sankar");
		System.out.println(s1==s2);
		Map m=new IdentityHashMap();
		m.put(s1,1);
		System.out.println(m.get(s2));//IdentityHashMap() compare the object using "==" operator.
	}
}
