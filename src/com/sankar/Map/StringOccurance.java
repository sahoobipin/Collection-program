package com.sankar.Map;

import java.util.LinkedHashMap;
import java.util.Map;

import javax.swing.text.html.HTMLDocument.Iterator;

public class StringOccurance {
	public static void main(String[] args) {
		String s="banana";
		Map<Character,String>m=new LinkedHashMap<Character,String>();
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(!m.containsKey(ch))
				m.put(ch,i+" ");
			else {
				String v=m.get(ch);
				v=v+","+i;
				m.put(ch, v);
			}
		}
		java.util.Iterator<Character> i=m.keySet().iterator();
		while(i.hasNext()) {
			Object k=i.next();
			Object v=m.get(k);
			System.out.println(k+"="+v);
		}
	}
}
