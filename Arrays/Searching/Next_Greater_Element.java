class Solution {
	
	int binarySearch(int [] arr,int key, int low,int high){
		
		if(high < 0){
			
			int lowerElement = arr[0];
			
			return lowerElement;
		}
		
		if(low > high){
			
			int greaterElement = arr[arr.length-1];
			return greaterElement;
		}
		
		int mid = (low+high)/2;
		
		if(arr[mid] == key){
			
			if(mid == arr.length-1){
				
				return arr[mid];
			}
			else if(arr[mid+1] > key){
				
				return arr[mid+1];
			}
			else{
				
				return binarySearch(arr,key,mid+1,high);
			}
		}
		
		else if(arr[mid] > key){
			
			return binarySearch(arr,key,low,mid-1);
		}
		return binarySearch(arr,key,mid+1,high);
	}
	
	int getNextGreaterElement (int[] arr, int key) {
		// add your logic here
		
		int low = 0;
		int high = arr.length-1;
		
		int nextGreaterElement = binarySearch(arr,key,low,high);
		
		return nextGreaterElement;
	}
}
