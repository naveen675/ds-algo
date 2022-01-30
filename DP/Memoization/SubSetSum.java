class Solution {
	
	boolean hasValidSubsetUtil(int [] A,int n,int target,boolean [][] dp){
		
		if(target == 0){ 
			
			dp[n][target] = true;
			return dp[n][target];
		}
		
		if(n == 0){ 
			
			dp[n][target] =  false;
			return dp[n][target];
		}
		
		
		if(A[n-1] <= target){
			
			dp[n][target] = (hasValidSubsetUtil(A,n-1,target-A[n-1],dp) || hasValidSubsetUtil(A,n-1,target,dp));
		}
		
		else{
			dp[n][target] = hasValidSubsetUtil(A,n-1,target,dp);
		}
		
		return dp[n][target];
	}
	
	boolean hasValidSubset(int[] A, int target) {
	    // add your logic here
		
		int n = A.length;
		boolean [][] dp = new boolean [n+1][target+1]; 
		return hasValidSubsetUtil(A,n,target,dp);
	}
}
