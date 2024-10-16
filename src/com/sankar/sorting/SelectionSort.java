package com.sankar.sorting;

public class SelectionSort {
	public static void main(String[] args) {
		int[] a={4,3,7 ,2,5,1};
		Sort(a);
		for(int n:a)
			System.out.print(n+" ");
		System.out.println();
	}
	public static void Sort(int[] a)
	{
		for(int i=0;i<a.length-1;i++)
		{
			int min=i;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[j]<a[min])
					min=j;
			}
			if(i!=min) {
				int temp=a[i];
				a[i]=a[min];
				a[min]=temp;
			}
		}
	}
}
