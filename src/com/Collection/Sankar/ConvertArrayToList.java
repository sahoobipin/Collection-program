package com.Collection.Sankar;

import java.util.ArrayList;
import java.util.Collections;

public class ConvertArrayToList {

	public static void main(String[] args) {
		String[]a= {"Java","C++","C#","Python","SQL"};
		
		ArrayList<String>list=new ArrayList<String>();
		
		Collections.addAll(list,a);
		System.out.println(list);
	}
}
