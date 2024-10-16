package com.sankar.sorting;

public class MergeSort {
	public static void main(String[] args) {
		int[]a= {5,8,9,1,7,2,8,3,6};
		Sort(a);
		for(int n:a)
			System.out.print(n+" ");
		System.out.println();
	}
	public static void Sort(int[] a)	{
		if(a.length==1) return;
			int []l=new int [a.length/2];
			int[] r=new int[a.length-l.length];
			int i=0;
			while(i<l.length) {
				l[i]=a[i];
				i++;
			}
			int j=0;
			while(j<r.length) {
				r[j]=a[i];
				i++;
				j++;
			}
			Sort(l);
			Sort(r);
			Merge(l,r,a);
	}
	private static void Merge(int[] a,int[] b,int[] c){
		int i=0,j=0,k=0;
		while(i<a.length && j<b.length)	{
			if(a[i]<b[j])
				c[k++]=a[i++];
			else
				c[k++]=b[j++];
		}
		while(i<a.length)c[k++]=a[i++];
		while(j<b.length)c[k++]=b[j++];
	}
}