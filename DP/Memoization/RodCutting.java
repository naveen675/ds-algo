class Solution{
    
  static int rodCuttingUtil(int [] prices,int n,int lengthOfRod,int [][]dp) {
		
		if(dp[n][lengthOfRod] != -1) {
			
			return dp[n][lengthOfRod];
		}
		
		if(n == 0 || lengthOfRod == 0) {
			
			dp[n][lengthOfRod] =0;
      
			return dp[n][lengthOfRod];
		}
		
		if(n <= lengthOfRod) {
			
			dp[n][lengthOfRod] = Math.max(rodCuttingUtil(prices,n,lengthOfRod-n,dp)+prices[n-1],rodCuttingUtil(prices,n-1,lengthOfRod,dp));
		}
    
		else {
			dp[n][lengthOfRod] = rodCuttingUtil(prices,n-1,lengthOfRod,dp);
		}
		
		return dp[n][lengthOfRod];
	}
	
	static int rodCutting(int [] prices,int lengthOfRod) {
		
		int n = lengthOfRod;
		int [][] dp = new int [n+1][lengthOfRod+1];
		
		for(int i=0;i<=n;i++) {
			for(int j=0;j<=lengthOfRod;j++) {
				
				Arrays.fill(dp[i], -1);
			}
		}
		return rodCuttingUtil(prices,n,lengthOfRod,dp);
	}
    
}
