class Solution {
	
	int lcs(int [] arr,int [] sorted,int m,int n){
		
		
		if(m == 0 || n == 0){
			return 0;
			
		}
		if(arr[m-1] == sorted[n-1]){
			return arr[m-1]+lcs(arr,sorted,m-1,n-1);
		}
		else{
			
			return Math.max(lcs(arr,sorted,m-1,n),lcs(arr,sorted,m,n-1));
		}
	}
	
	int maxSumSubsequence(int[] arr) {
	    // add you logic here
		
		int [] sorted =new int[arr.length];
		
		
		int m = arr.length;
		int n = sorted.length;
		for(int i=0;i<arr.length;i++){
			sorted[i] = arr[i];
		}
		Arrays.sort(sorted);
		
		return lcs(arr,sorted,m,n);
 	}
}
