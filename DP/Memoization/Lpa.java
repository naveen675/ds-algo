class Solution{
  
  static int longestPalindromicSubSeq(String s,int start,int end,int [][] dp) {
			
			if(dp[start][end] != -1) {
			
				return dp[start][end];
			}
			
			
			if(start == end) {
				
				dp[start][end] = 1;
				return dp[start][end];
			}
			if(start > end) {
				
				dp[start][end] =0;
				return dp[start][end];
			}
			
			if(s.charAt(start) == s.charAt(end)) {
				
				dp[start][end] =  2+longestPalindromicSubSeq(s,start+1,end-1,dp);
			}
			else {
				
				dp[start][end] =  Math.max(longestPalindromicSubSeq(s,start+1,end,dp), longestPalindromicSubSeq(s,start,end-1,dp));
			}
			
			return dp[start][end];
			
		}
		
	static int lps(String s) {
		
		int start =0;
		int end = s.length();
		int [][] dp = new int[end+1][end+1];
		for(int i=0;i<=end;i++) {
			for(int j=0;j<=end;j++) {
				
				Arrays.fill(dp[i], -1);
			}
		}
		return longestPalindromicSubSeq(s,start,end-1,dp);
	}
}
