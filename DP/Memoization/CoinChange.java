class Solution {
	
	int numberOfCombinationsUtil(int [] coins,int n,int target,int [][] dp){
		
		if(dp[n][target] != -1){
			return dp[n][target];
		}
		
		
		if(target == 0){
			
			dp[n][target] =1;
			return dp[n][target];
		}
		
		if(n == 0){
			dp[n][target] =0;
			return dp[n][target];
		}
		
		if(coins[n-1] <= target){
			
			dp[n][target] = numberOfCombinationsUtil(coins,n,target-coins[n-1],dp) + numberOfCombinationsUtil(coins,n-1,target,dp);
		}
		else{
			dp[n][target] = numberOfCombinationsUtil(coins,n-1,target,dp);
		}
		
		return dp[n][target];
	}
	
	int numberOfCombinations(int[] coins, int target) {
	    // add you logic here
		
		int n = coins.length;
		int [][] dp = new int [n+1][target+1];
		for(int i=0;i<=n;i++){
			for(int j=0;j<=target;j++){
				Arrays.fill(dp[i],-1);
			}
		}
		return numberOfCombinationsUtil(coins,n,target,dp);
	}
}
