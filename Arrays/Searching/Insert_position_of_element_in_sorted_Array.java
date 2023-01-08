class Solution {
	
	int binarySearch(int [] arr,int key, int low, int high){
		
		
		if(low >= high){
			
			
			
			if(arr[low] > key){
				
				return low;
			}
			else{
				return low+1;
			}
		}
		
		int mid = (low+high)/2;
		
		if(arr[mid] == key){
			
			return mid;
		}
		
		else if(key > arr[mid]){
			
			return binarySearch(arr,key, mid+1, high);
			
		}
		
		else{
			return binarySearch(arr, key, low, mid-1);
		}
	}
	
	int getInsertPosition (int[] arr, int key) {
		// add your logic here
		
		int low =0;
		int high = arr.length-1;
		int keyIndex = binarySearch(arr,key,low,high);
		
		return keyIndex;
		
		
	}
}
