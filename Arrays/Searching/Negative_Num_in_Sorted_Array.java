class Solution {


//SOLUTION 1

	public static int negativeElementLastIndex(int [] arr, int low,int high){

		
		if(low > high){
	
			return -1;
	}
		
		int mid = (low+high)/2;
		
		
	
		if(arr[mid] < 0){
		
			if(mid == arr.length-1 || arr[mid+1] >= 0){
			
				return mid;
	}
			else if(arr[mid+1] < 0){
	
				return negativeElementLastIndex(arr,mid+1,high);
	}
	}
		
		return negativeElementLastIndex(arr,low,mid-1);
	}
	
	
	public static int negativeElementRange(int [] arr, int low,int high){
		
		int lastIndex = negativeElementLastIndex(arr,low,high);
		int totalNegativeElements = lastIndex+1;
		return totalNegativeElements;
	}
	
		




	
 -------------------------------------------------------------------------------------------------------------------------	
	
//SOLUTION 2	
	
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
