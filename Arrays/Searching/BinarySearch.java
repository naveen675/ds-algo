// Online Java Compiler
// Use this online editor to compile and run Java code online
import java.util.*;
import java.lang.*;
import java.io.*;

// Please make sure not to delete the WorkAtTech class
// You can create additional non-public classes as well
// But the main method should be in the WorkAtTech class
class BinarySearch
	
{
	
	public static int binarySearch(int [] arr, int requiredElement,int low,int high){
		
		if(low>high){
			
			return -1;
		}
		
		
		int mid = (low+high)/2;
		
		if(arr[mid] == requiredElement){

			return mid;
		}
		else if(requiredElement > arr[mid]){
			
			return binarySearch(arr,requiredElement,mid+1,high);
		}
		else{
			
			return binarySearch(arr,requiredElement,low,mid-1);
		}
	}
	
	public static void main (String[] args) throws java.lang.Exception
	{
		//
		
		int [] arr = {1,3,5,7,9,10,12,14,22,25,34};
		int requiredElement = 1;
		int low = 0;
		int high = arr.length-1;
		
		int requiredElementIndex = binarySearch(arr,requiredElement,low,high);
		System.out.println(requiredElementIndex);
	}
}
