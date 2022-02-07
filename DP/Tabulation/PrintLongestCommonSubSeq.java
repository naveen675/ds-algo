class Solution{
  
  static String commonSubString(String s1,String s2,int n,int m,int [][] dp,String s) {
		
		if(n == 0 || m == 0) {
			StringBuilder sb = new StringBuilder(s);
			s = sb.reverse().toString();
			return s;
		}
		if(s1.charAt(n-1) == s2.charAt(m-1)) {
			
			s = s+s1.charAt(n-1);
			return commonSubString(s1,s2,n-1,m-1,dp,s);
			
		}
		else {
			if(dp[n-1][m] >= dp[n][m-1]) {
				return commonSubString(s1,s2,n-1,m,dp,s);
			}
			else {
				return commonSubString(s1,s2,n,m-1,dp,s);
			}
		}
	}
	
	static String logestCommonSubstringUtil(String s1,String s2,int n,int m,int [][] dp) {
		
		for(int i=0;i<=n;i++) {
			for(int j =0;j<=m;j++) {
				
				if(i == 0 || j == 0) {
					dp[i][j] =0;
				}
				
				
				else {
					if(s1.charAt(i-1) == s2.charAt(j-1)) {
						
						dp[i][j] = dp[i-1][j-1]+1;
					}
					else {
						dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
					}
				}
				
			}
		
		}
		return commonSubString(s1,s2,n,m,dp,"");
	}
	
	static String longestCommonSubstring(String s1,String s2) {
		
		int n = s1.length();
		int m = s2.length();
		int [][] dp =new int[n+1][m+1];
		return logestCommonSubstringUtil(s1,s2,n,m,dp);
		}
}
