package com.bitlabs.Jagadish;

public class Example1 {
	public void Findmaxsmax(int a[]) {
		int max=0,smax=0;
		for(int i=0;i<a.length;i++) {
		if(max<a[i])
		{
		smax=max;
		max=a[i];
		}
		else if(smax<a[i]) {
			smax=a[i];
		
		}
		}
		System.out.println(+max);
		System.out.println(+smax);
	}

	public static void main(String[] args) {
		int arr[]= {23,90,45,103,43,56};
		Example1 obj=new Example1();
		obj.Findmaxsmax(arr);
		

	}

}
