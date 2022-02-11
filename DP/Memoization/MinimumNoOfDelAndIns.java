class Solution{
  
  static int longestCommonSubSequence(String s1,String s2,int n,int m,int [][] dp) {
		
		if(dp[n][m] != -1) {
			
			return dp[n][m];
		}
		
		
		if(n == 0 || m == 0) {
			dp[n][m] =0;
			return dp[n][m];
		}
		
		if(s1.charAt(n-1) == s2.charAt(m-1)) {
			
			
			
			dp[n][m] =  1+longestCommonSubSequence(s1,s2,n-1,m-1,dp);
		}
		else {
			
			dp[n][m] =  Math.max(longestCommonSubSequence(s1,s2,n-1,m,dp), longestCommonSubSequence(s1,s2,n,m-1,dp));
			
		}
		return dp[n][m];
	}
  
  
  static int minimumDelAndInser(String s1,String s2) {
		
		int n = s1.length();
		int m = s2.length();
		int [][] dp = new int[n+1][m+1];
		for(int i=0;i<=n;i++) {
			for(int j=0;j<=m;j++) {
				
				Arrays.fill(dp[i],-1);
			}
		}
		int lcs = longestCommonSubSequence(s1,s2,n,m,dp);
		
		
		
		int noOfdel = n - lcs;
		int noOfIns = m - lcs;
		return (noOfdel+noOfIns);
	}
}
