package com.sankar.sorting;

public class BubbleSort {
	public static void main(String[] args) {
		int[] a={2,1,4,3,6,7,5};
		Sort(a);
		for(int n:a)
			System.out.print(n+" ");
		System.out.println();
	}
	public static void Sort(int[] a)
	{
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=0;j<a.length-1-i;j++)
			{
				if(a[j]>a[j+1])
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
	}
}
