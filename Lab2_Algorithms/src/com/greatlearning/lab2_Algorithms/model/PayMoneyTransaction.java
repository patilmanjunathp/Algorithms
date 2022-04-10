package com.greatlearning.lab2_Algorithms.model;

public class PayMoneyTransaction 

{
	
	
	public int transaction(int array[],int target)
	{
		int sum=0;
		
		for (int i=0;i<array.length;i++ )
			{
			    sum+=array[i];
			    if(sum>=target)
			    {
			    return i+1;
			    
		        }
			}
		
		return -1;
		
		
	 }

}


