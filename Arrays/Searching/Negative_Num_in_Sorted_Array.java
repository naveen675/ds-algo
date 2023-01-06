class Solution {
	
	int binarySearch(int [] arr, int low, int high){
		
		
		int mid = (low+high)/2;
		
		if(low > high){
			return 0;
		}
		
		if(arr[mid] <0){
			
			if(mid == arr.length-1 || arr[mid+1] > 0){
				return mid+1;
			}
			
			else{
				return binarySearch(arr,mid+1,high);
			}
			
			
		}
		
		return binarySearch(arr,low,mid-1);
	}
	
	int getNegativeNumbersCount (int[] arr) {
		// add your logic here
		
		int arrLength = arr.length;
		int low =0;
		
		int numberOfNegatives = binarySearch(arr,low,arrLength-1);
		return numberOfNegatives;
	}
}
