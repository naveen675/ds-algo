class Solution {
	
	int numberOfCombinationsUtil(int [] coins,int n,int target,int [][] dp){
		
		for(int i=0;i<=n;i++){
			for(int j=0;j<=target;j++){
				
				if(j == 0){
					dp[i][j] =1;
				}
				else if(i == 0){
					dp[i][j] = 0;
				}
				else{
					
					if(coins[i-1] <= j){
						dp[i][j] = dp[i][j-coins[i-1]] + dp[i-1][j];
					}
					else{
						dp[i][j] = dp[i-1][j];
					}
				}
			}
		}
		
		return dp[n][target];
	}
	
	int numberOfCombinations(int[] coins, int target) {
	    // add you logic here
		
		int n = coins.length;
		int [][] dp = new int [n+1][target+1];
		
		return numberOfCombinationsUtil(coins,n,target,dp);
	}
}
