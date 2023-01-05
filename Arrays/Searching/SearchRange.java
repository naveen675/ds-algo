class Solution {
	
	private static int binarySearch(int [] arr,int left,int right,int requiredELement){
		
		if(left > right){
			return -1;
		}
		int mid = (left+right)/2;
		if(arr[mid] == requiredELement){
			return mid;
		}
		if(arr[mid] > requiredELement){
			return binarySearch(arr,left,mid-1,requiredELement);
		}
		return binarySearch(arr,mid+1,right,requiredELement);
	}
	
	private static int LowerRange(int [] arr,int lowerPosition,int requiredELement ){
		
		while(lowerPosition >= 0 && arr[lowerPosition] == requiredELement){
			lowerPosition--;
		}
		return lowerPosition+1;
	}
	
	private static int UpperRange(int [] arr,int UpperPosition,int requiredELement ){
		
		while(UpperPosition < arr.length && arr[UpperPosition] == requiredELement){
			UpperPosition++;
		}
		return UpperPosition-1;
	}
	
	
	int[] searchRange (int[] arr, int key) {
		// add your logic here
		int left = 0,right=arr.length-1;
		int [] range = {-1,-1};
		int keyPosition = binarySearch(arr,left,right,key);
		
		if(keyPosition != -1){
			range[1] = UpperRange(arr,keyPosition,key);
			range[0] = LowerRange(arr,keyPosition,key);
		}
		return range;
		
	}
}
