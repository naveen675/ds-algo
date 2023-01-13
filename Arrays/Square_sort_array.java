class Solution {
	int[] getSquareSortedArray (int[] arr) {
		// add your logic here
		
		int arrLength = arr.length;
		
		for(int i=0;i<arrLength;i++){
			
			int num = arr[i];
			
			arr[i] = num*num;
		}
		
		Arrays.sort(arr);
		
		return arr;
	}
}
