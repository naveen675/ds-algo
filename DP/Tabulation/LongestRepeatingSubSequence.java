class Solution{
  
  	static int longestRepeatingSubSequence(String s1,int m,int n,int [][] dp) {
		
		
		for(int i=0;i<=n;i++) {
			for(int j=0;j<=m;j++) {
				
				if(i==0 || j== 0) {
					dp[i][j] =0;
				}
				else {
				
					if(i != j && s1.charAt(i-1) == s1.charAt(j-1)) {
						
						dp[i][j] = 1+dp[i-1][j-1];
					}
					else {
						
						dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
					}
				}
			}
				
		}
		
		return dp[n][m];
	}
	
	static int lrs(String s) {
		
		int n =s.length();
		int m = s.length();
		
		int [][] dp = new int[n+1][m+1];
		
		
		return longestRepeatingSubSequence(s,m,n,dp);
		
	}
}
