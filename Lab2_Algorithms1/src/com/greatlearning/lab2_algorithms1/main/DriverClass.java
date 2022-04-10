package com.greatlearning.lab2_algorithms1.main;

import java.util.Arrays;
import java.util.Scanner;



public class DriverClass
{

	public static void main(String[] args)
	{
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the size of currency denominations");
		int size=sc.nextInt();
		
		System.out.println("Enter the currency denominations value");
		
		int array[]=new int [size];
		
		for(int i=0;i<size;i++)
		{
			array[i]=sc.nextInt();
		}
		
		System.out.println("Original array");
		//display(array);
		
		System.out.println(Arrays.toString(array));
		
		System.out.println("Sorted array");
		
		mergeSort(array, 0, array.length-1);
		
		System.out.println(Arrays.toString(array));
		 
		//display(array);
		
		int count[]=new int[size];
		
		System.out.println("Enter the amount you want to pay");
		int amount =sc.nextInt();
		
		int amountRemaining=minDenominations(array,count,amount);
		
		if(amountRemaining>0)
		{
			System.out.println("Amount can't be paid with the given denominations");
			
			return;
		}
		
		System.out.println("Your payment approach in order to give min no of notes will be");
		
		for(int i=array.length-1;i>=0;i--)
		{
			
			if(count[i]>0)
			{
			System.out.println(array[i]+":"+count[i]);
		    }
		}
		
		}

	public static int minDenominations(int[] array, int[] count, int amount) {
		
		for(int i=array.length-1;i>=0;i--)
		{
			if(amount>=array[i])
			{
				count[i]=amount/array[i];
				amount=amount%array[i];
			}
		}
		
		return amount;
	}

	public static void display(int arr[])
	{
		int n=arr.length;
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	
	public static void mergeSort(int arr[], int left, int right)
	{
		
		if(left<right)
		{
			int mid=(left+right)/2;
			
			mergeSort(arr,left,mid);
			mergeSort(arr,mid+1,right);
			merge(arr,left,mid,right);
		}
	}
	
	public static void merge(int arr[],int left,int mid,int right)
	{
		int len1=mid-left+1;
		int len2=right-mid;
		
		int leftArr[]=new int[len1];
		int rightArr[]=new int[len2];
		
		
		
		for(int i=0;i<len1;i++)
		{
			leftArr[i]=arr[left+i];
		}
		
		for(int j=0;j<len2;j++)
		{
			rightArr[j]=arr[mid+1+j];
		}
		
		int i,j,k;
		i=0;
		j=0;
		k=left;
		
		while(i<len1 && j<len2)
		{
			if(leftArr[i]<=rightArr[j])
			{
				arr[k]=leftArr[i];
				i++;
			}
			else
			{
				arr[k]=rightArr[j];
				j++;
			}
			
			k++;
		}
		
		while(i<len1)
		{
			arr[k]=leftArr[i];
			i++;
			k++;
		}
		
		while(j<len2)
		{
			arr[k]=rightArr[j];
			j++;
			k++;
		}
		
	}

	

}
