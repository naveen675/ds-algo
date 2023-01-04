// Online Java Compiler
// Use this online editor to compile and run Java code online
import java.util.*;
import java.lang.*;
import java.io.*;

// Please make sure not to delete the WorkAtTech class
// You can create additional non-public classes as well
// But the main method should be in the WorkAtTech class
class Sorting
	
{
	
	public static void mergeSortUtil(int [] arr, int start, int end){
		
		int [] mergedArray = new int [end-start+1];             //
		int mergedArrayIndex = 0;
		int mid  = (start+end)/2;
		int firstArrayStartIndex = start;
		int firstArrayEndIndex = mid;
		int secondArrayStartIndex = mid+1;
		int secondArrayEndIndex = end;
		
		while(firstArrayStartIndex <= firstArrayEndIndex && secondArrayStartIndex <= secondArrayEndIndex){          //
			
			if(arr[firstArrayStartIndex] < arr[secondArrayStartIndex]){
				
				mergedArray[mergedArrayIndex++] = arr[firstArrayStartIndex++];
			}
			else{
				
				mergedArray[mergedArrayIndex++] = arr[secondArrayStartIndex++];
			}
		}
		for(int i=firstArrayStartIndex;i<=firstArrayEndIndex;i++){
			mergedArray[mergedArrayIndex++] = arr[i];
		}
		for(int i=secondArrayStartIndex;i<=secondArrayEndIndex;i++){
			
			mergedArray[mergedArrayIndex++] = arr[i];
		}
		
		
		for(int i=0;i<mergedArray.length;i++){
			
			arr[start++] = mergedArray[i];
		}
	}

	public static void mergeSort(int [] arr,int start,int end){
		
		if(start >= end){
			return;
		}
		
		int mid = (start+end)/2;
		
		mergeSort(arr,start,mid);
		mergeSort(arr,mid+1,end);
		
		mergeSortUtil(arr, start,end);
	}
	
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		
		int [] arr = {20,4,12,1,8,14,3,16,2,9};
		
		mergeSort(arr,0,arr.length-1);              //
		
		for(int i=0;i<arr.length;i++){
			
			System.out.println(arr[i]);
		}
		
		
		
	}
}
