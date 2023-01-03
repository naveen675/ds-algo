// Online Java Compiler
// Use this online editor to compile and run Java code online


// O(nlogn)

import java.util.*;
import java.lang.*;
import java.io.*;



// Please make sure not to delete the WorkAtTech class
// You can create additional non-public classes as well
// But the main method should be in the WorkAtTech class
class Sorting
	
{
	public static int quickSortUtil(int [] arr, int low, int high){
		
		int startingIndexOfUnsorted = low;
		int pivotIndex = high;
		int temp=0;
		
		for(int i=low;i<high;i++){
			
			if(arr[i] < arr[pivotIndex]){
				
				temp = arr[i];
				arr[i] = arr[startingIndexOfUnsorted];
				arr[startingIndexOfUnsorted++] = temp;
			}
			
		}
		
		temp = arr[pivotIndex];
		arr[pivotIndex] = arr[startingIndexOfUnsorted];
		arr[startingIndexOfUnsorted] = temp;
		
		return startingIndexOfUnsorted;
	}
	
	
	public static void quickSort(int [] arr, int low,int high){
		
		if(low >= high){
			return;
		}
		
		int pivotIndex = quickSortUtil(arr,low,high);
		
		quickSort(arr,low,pivotIndex-1);
		quickSort(arr,pivotIndex+1,high);
		
		
		
	}
	
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		
		int [] arr = {2,2,2,2,2,1};
		
		quickSort(arr,0,arr.length-1);
		
		for(int i=0;i<arr.length;i++){
			
			System.out.println(arr[i]);
		}
		
		
		
	}
}
