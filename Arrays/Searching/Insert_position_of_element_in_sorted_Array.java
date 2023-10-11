package Searching;

class Solution {
	
//
//	// Solution 1
//	int binarySearch(int [] arr,int key, int low, int high){
//
//
//		if(low >= high){
//
//
//
//			if(arr[low] > key){
//
//				return low;
//			}
//			else{
//				return low+1;
//			}
//		}
//
//		int mid = (low+high)/2;
//
//		if(arr[mid] == key){
//
//			return mid;
//		}
//
//		else if(key > arr[mid]){
//
//			return binarySearch(arr,key, mid+1, high);
//
//		}
//
//		else{
//			return binarySearch(arr, key, low, mid-1);
//		}
//	}
//
//	int getInsertPosition (int[] arr, int key) {
//		// add your logic here
//
//		int low =0;
//		int high = arr.length-1;
//		int keyIndex = binarySearch(arr,key,low,high);
//
//		return keyIndex;
//
//
//	}

	// Solution 2

	public static int searchUtil(int [] arr, int low, int high, int target){

		if(low > high){ return low;}

		int mid = (low+high)/2;

		if(arr[mid] == target && arr[mid-1] != target){ return mid;}

		else if(arr[mid] < target) {return searchUtil(arr,mid+1, high,target); }

		return searchUtil(arr,low, mid-1, target);


	}

	public static int search(int [] arr,int target){

		int low=0;

		int high = arr.length-1;

		if(arr[low] >= target){ return low; }

		else if(arr[high] < target) { return high+1; }

		return searchUtil(arr,low,high,target);
	}

	public static void main(String [] args){

		int [] arr = {1,2,3,4,5,6,7,8};

		int target = 7;

		int index = search(arr, target);

		System.out.println(index);

	}

}
