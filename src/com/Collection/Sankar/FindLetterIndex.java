package com.Collection.Sankar;

import java.util.*;

public class FindLetterIndex {
	public static void main(String[] args) {
		String s="banana";
		Map<Character,String> m=new LinkedHashMap<Character,String>();
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(!m.containsKey(ch)) {
				m.put(ch,i+"");
			}else {
				String v=m.get(ch);
				v=v+","+i;
				m.put(ch, v);
			}
		}
		Iterator i=m.keySet().iterator();
		while(i.hasNext()) {
			Object k=i.next();
			Object v=m.get(k);
			System.out.println(k+"="+v);
		}
	}
}
