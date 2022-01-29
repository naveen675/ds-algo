class Solution {
	
	int climbStairsUtil(int n, int [] dp){
		
		if(n<0){
			return 0;
		}
		
		if(dp[n] != -1){
			return dp[n];
		}
		
		if(n == 0){
			dp[n] = 1;
			return dp[n];
		}
		
		dp[n] =  climbStairs(n-1)+climbStairs(n-2);
		return dp[n];
	}
		
	
	
	int climbStairs(int n) {
	    // add you logic here
		
		int [] dp = new int[n+1];
		Arrays.fill(dp,-1);
		return climbStairsUtil(n,dp);
		
		
}
	
}