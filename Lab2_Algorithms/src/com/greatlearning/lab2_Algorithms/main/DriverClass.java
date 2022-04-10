package com.greatlearning.lab2_Algorithms.main;

import java.util.Scanner;

import com.greatlearning.lab2_Algorithms.model.PayMoneyTransaction;

public class DriverClass 

{

	public static void main(String[] args) 
	
	{
		
		PayMoneyTransaction t=new PayMoneyTransaction();
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the size of transaction array");
		
		int size=sc.nextInt();
		
		int[] array=new int[size];
		
		System.out.println("Enter the values of array");
		
		for(int i=0;i<array.length;i++)
		{
			array[i]=sc.nextInt();
			
		}
		
		System.out.println("Enter the No of targets");
		
		int n = sc.nextInt();
		
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the value of target"+(i+1));
			
			int target=sc.nextInt();
			
			int noOfTransaction=t.transaction(array, target);
			
			if(noOfTransaction==-1)
			{
			System.out.println("Target not achieved");
			
			}
			else
			{
				System.out.println("Target achieved after "+noOfTransaction+ " transactions");
			}
		
		
	}

}
}
