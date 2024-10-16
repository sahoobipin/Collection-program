package com.sankar.BinarySearchTree;

import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTree 
{
	private Node root=null;
	private int count=0;
	boolean flag=false;
	
	public boolean add(int k)
	{
		flag=false;
		root=addNode(k,root);
		return flag;
	}
	private Node addNode(int k,Node n)
	{
		if(n==null) {
			n= new Node(k);
			count++;
			flag=true;
			return n;
		}
		if(k<n.key) 
			n.left=addNode(k,n.left);
		else if(k>n.key) 
			n.right=addNode(k,n.right);
		return n;
	}
	public int size() {
		return count;
	}
	public void levelOrder() {
		Queue<Node> q=new LinkedList<Node>();
		if(root!=null)
			q.add(root);
		while(!q.isEmpty()) {
			Node n=q.poll();
			System.out.print(n.key+" ");
			if(n.left!=null)q.add(n.left);
			if(n.right!=null)q.add(n.right);
		}
		System.out.println();
	}
	public void preOrderTraverse() {
		preOrder(root);
		System.out.println();
	}
	private void preOrder(Node n) {
		if(n==null)return;
		System.out.print(n.key+" ");
		preOrder(n.left);
		preOrder(n.right);
	}
	public void postOrderTraverse() {
		postOrder(root);
		System.out.println();
	}
	private void postOrder(Node n) {
		if(n==null)return;
		postOrder(n.left);
		postOrder(n.right);
		System.out.print(n.key+" ");
	}
	public void inOrderTraverse() {
		inOrder(root);
		System.out.println();
	}
	private void inOrder(Node n) {
		if(n==null)return;
		inOrder(n.left);
		System.out.print(n.key+" ");
		inOrder(n.right);
	}
}