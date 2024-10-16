package com.Collection.Sankar;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
public class Demo {
	public static void main(String[] args) {
		Queue q=new PriorityQueue(new Desc());
		q.add(12);
		q.add(7);
		q.add(77);
		q.add(20);
		q.add(21);
		System.out.println(q);
		while(!q.isEmpty())
		{
			System.out.println(q.poll());
		}
	}
}
class Desc implements Comparator
{
	public int Compare(Object arg1, Object arg2)
	{
		Integer o1=(Integer)arg1;
		Integer o2=(Integer)arg2;
		return o2.intValue()-o1.intValue();
	}

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		return 0;
	}
}