class Solution{
  
  static int lpss(String s,int start,int end,int [][] dp) {
		
		if(dp[start][end] != -1) {
			return dp[start][end];
		}
		
		
		if(start == end) {
			dp[start][end] =1;
			return dp[start][end];
		}
		if(start > end) {
			dp[start][end] = 0;
			return dp[start][end];
		}
		
		if(s.charAt(start) == s.charAt(end)) {
			
			dp[start][end] =  2 + lpss(s,start+1,end-1,dp);
			
		}
		
		else {
			
			dp[start][end] =  Math.max(lpss(s,start+1,end,dp), lpss(s,start,end-1,dp));
		}
		
		return dp[start][end];dd
			}
	
	static int minimumDelToMakePalindrome(String s) {
		
		int n = s.length();
		int [][] dp = new int[n+1][n+1];
		
		for(int i=0;i<=n;i++) {
			for(int j=0;j<=n;j++) {
				Arrays.fill(dp[i],-1);                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        
			}
		}
		int lps = lpss(s,0,n-1,dp);
		int minDel = n-lps;
		
		
		
		return minDel;
	}
	
}
