class Solution {
	int[] getCumulativeSum (int[] arr) {
		
		int [] cumulativeSum = new int[arr.length];
		int sum=0;
		
		for(int index = 0;index<arr.length;index++){
			
			sum = sum + arr[index];
			cumulativeSum[index]= sum;
		}
		return cumulativeSum;
	}
	 
}
