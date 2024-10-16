package com.sankar.sorting;

public class InsertionSort {
	public static void main(String[] args) {
		int[] a= {3,2,1,4,5,7};
		Sort(a);
		for(int n:a)
			System.out.print(n+" ");
	}
	public static void Sort(int [] a)
	{
		for(int i=1;i<a.length;i++)
		{
			int key=a[i];
			int j=i-1;
			while(j>=0 && a[j]>key)
			{
				a[j+1]=a[j];
				j--;
			}
			a[j+1]=key;
		}
	}
}
