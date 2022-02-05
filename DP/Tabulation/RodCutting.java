class Solution{

  	static int rodCuttingUtil(int [] prices,int n,int lengthOfRod,int [][]dp) {
		
		for(int i=0;i<=n;i++) {
			for(int j=0;j<=lengthOfRod;j++) {
				
				if(i == 0 || j == 0) {
					dp[i][j] = 0;
				}
				
				else {
					
					if(i <= j) {
						dp[i][j] = Math.max(dp[i][j-i]+prices[i-1], dp[i-1][j]);
					}
					else {
						dp[i][j] = dp[i-1][j];
					}
				}
			}
		}
		return dp[n][lengthOfRod];
	}
	
	static int rodCutting(int [] prices,int lengthOfRod) {
		
		int n = lengthOfRod;
		int [][] dp = new int [n+1][lengthOfRod+1];
		
		
		return rodCuttingUtil(prices,n,lengthOfRod,dp);
	}
	
}
