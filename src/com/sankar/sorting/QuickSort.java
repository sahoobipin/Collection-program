package com.sankar.sorting;

public class QuickSort {
	public static void main(String[] args) {
		int [] a={4,3,5,6,3,1};
		Sort(a,0,a.length-1);
		for(int n:a)    
			System.out.print(n+" ");
		System.out.println();		
	}
	public static void Sort(int[] a,int start, int end){
		if(start>=end)return;
		int i=start,j=end;
		int pivot=a[(start+end)/2];
		while(i<=j){
			while(a[i]<pivot)i++;
			while(a[j]>pivot)j--;
			if(i<=j){
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				i++;
				j--;
			}
		}
		Sort(a,start,j);
		Sort(a,i,end);
	}
}