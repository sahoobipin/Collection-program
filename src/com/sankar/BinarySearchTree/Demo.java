package com.sankar.BinarySearchTree;

public class Demo {
	public static void main(String[] args) {
		BinarySearchTree b=new BinarySearchTree();
		System.out.println(b.add(50));
		System.out.println(b.add(25));
		System.out.println(b.add(10));
		System.out.println(b.add(40));
		System.out.println(b.add(75));
		System.out.println(b.add(60));
		System.out.println(b.add(100));
		System.out.println("size= "+b.size());
		b.preOrderTraverse();
		b.postOrderTraverse();
		b.inOrderTraverse();
		b.levelOrder();
	}
}