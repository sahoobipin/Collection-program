package com.sankar.HashingForInteger;

public class DemoForInt {
	public static void main(String[] args) {
		Set s=new Set();
		System.out.println(s.add(10));
		System.out.println(s.add(73));
		System.out.println(s.add(72));
		System.out.println(s.add(73));
		System.out.println(s.add(51));
		s.display();
	}
}
