class Solution{
  static int longestRepeatingSubSequence(String s1,int m,int n,int [][] dp) {
		
		if(dp[n][m] != -1) {
			return dp[n][m];
		}
		
		
		if(m == 0 || n == 0) {
			dp[n][m] =0;
			return dp[n][m];
		}
		
		if(m!=n && s1.charAt(m-1) == s1.charAt(n-1) ) {
			
			dp[n][m] =  1+longestRepeatingSubSequence(s1,m-1,n-1,dp);
		}
		
		else {
			dp[n][m] =  Math.max(longestRepeatingSubSequence(s1,n-1,m,dp), longestRepeatingSubSequence(s1,n,m-1,dp));
		}
		
		return dp[n][m];
	}
	
	static int lrs(String s) {
		
		int n =s.length();
		int m = s.length();
		
		int [][] dp = new int[n+1][m+1];
		
		for(int i=0;i<=n;i++) {
			for(int j=0;j<=m;j++) {
				
				Arrays.fill(dp[i], -1);
			}
		}
		
		return longestRepeatingSubSequence(s,m,n,dp);
		
	}
}
