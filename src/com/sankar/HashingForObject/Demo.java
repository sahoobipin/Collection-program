package com.sankar.HashingForObject;

public class Demo {
	public static void main(String[] args) {
		Set s=new Set();
		System.out.println(s.add("java"));
		System.out.println(s.add("sql"));
		System.out.println(s.add("html"));
		System.out.println(s.add("python"));
		System.out.println(s.add("c"));
		System.out.println(s.add("c"));
		s.display();
	}
}
