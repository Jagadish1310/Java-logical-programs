package com.bitlabs.Jagadish;

import java.util.Arrays;

public class Example3 {
	public void delete(int a[],int ele) {
		int newarr[]=new int[a.length-1];
		for(int i=0,j=0;i<a.length;i++)
		{
			if(a[i]!=ele)
			{
				newarr[j]=a[i];
				j++;
			}
			
		}
		System.out.println(Arrays.toString(newarr));
		
	}

	public static void main(String[] args) {
		int arr[]= {23,34,24,56,43,65,63};
		Example3 obj1=new Example3();
		obj1.delete(arr,56);

	}

}
