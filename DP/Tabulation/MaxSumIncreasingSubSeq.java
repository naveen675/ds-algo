class Solution {
	
	int lcs(int [] arr,int [] sorted,int m,int n,int [][] dp){
			
		for(int i=0;i<=m;i++){
			for(int j=0;j<=n;j++){
				
				if(i == 0 || j == 0){
					dp[i][j] =0;
				}
				else{
					
					if(arr[i-1] == sorted[j-1]){
						dp[i][j] = arr[i-1]+dp[i-1][j-1];
					}
				else{
					dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
				}
			}
		}
		}
		return dp[m][n];
	}
	
	int maxSumSubsequence(int[] arr) {
	    // add you logic here
		
		int [] sorted =new int[arr.length];
		
		
		int m = arr.length;
		int n = sorted.length;
		int [][] dp= new int [m+1][n+1];
		for(int i=0;i<arr.length;i++){
			sorted[i] = arr[i];
		}
		Arrays.sort(sorted);
		
		return lcs(arr,sorted,m,n,dp);
 	}
}
