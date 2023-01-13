class Solution {
	boolean isArithmeticSequence (int[] arr) {
		// add your logic here
		boolean isAnArithmeticSequence = true;
		int arrLength = arr.length;
		
		if(arrLength == 1){
			return isAnArithmeticSequence;
		}
		Arrays.sort(arr);
		
		
		
		int diff = arr[0]-arr[1];
		
		for(int i=0;i<arrLength-1;i++){
			
			if(arr[i] - arr[i+1] != diff){
				
				isAnArithmeticSequence = false;
				break;
			}
		}
		
		return isAnArithmeticSequence;
	}
}
