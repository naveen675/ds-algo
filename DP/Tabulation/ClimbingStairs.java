class Solution {
	
	int climbStairsUtil(int n, int [] dp){
		
		for(int i=0;i<=n;i++){
			
			if( i ==0){
				dp[i] = 1;
			}
			
			else if(i == 1){
				dp[i] = i;
			}
			
			else{
				
				dp[i] = dp[i-1]+dp[i-2];
			}
		}
		return dp[n];
	}
		
	
	
	int climbStairs(int n) {
	    // add you logic here
		
		int [] dp = new int[n+1];
		
		return climbStairsUtil(n,dp);
		
		
}
	
}