package com.bitlabs.Jagadish;

import java.util.Arrays;

public class Example2 {
	public void insert(int arr[],int ele,int index) {
		//int newarr[]=new int[arr.length+1]; 
		//int temp=0;
		for(int i=arr.length-1;i<index;i--)
		{
			arr[i]=arr[i-1];
			
//			if(i==index)
//			{
//				newarr[i]=ele;
//			}
//			else if(i<index) {
//				newarr[i]=arr[i];
//			}
//			else
//				newarr[i]=arr[i-1];
		}
		arr[index]=ele;
		System.out.println(Arrays.toString(arr));
	}

	public static void main(String[] args) {
		
		int arr[]= {23,90,45,103,43,56};
		Example2 obj=new Example2();
		obj.insert(arr,67,4);
		

	}

}
