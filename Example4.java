package com.bitlabs.Jagadish;

import java.util.Arrays;

//import java.util.Arrays;

public class Example4 {
	public void delete(int a[],int index)
	{
		//int na[]= new int[a.length-1];
		int n=a.length;
		for(int i=index;i<n-1;i++) {
			a[i]=a[i+1];
			
		}
		--n;
		System.out.println(Arrays.toString(a));
	}

	public static void main(String[] args) {
		int arr[]= {23,90,45,103,43,56};
		Example3 obj=new Example3();
		obj.delete(arr,2);

	}

}
