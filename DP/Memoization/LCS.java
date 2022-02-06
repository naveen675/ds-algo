class Solution {
	
	int getLengthOfLCSUtil(String s1,String s2,int n,int m,int [][] dp){
		
		if(dp[n][m] != -1){
			return dp[n][m];
		}
		
		if(n == 0 || m == 0){
			dp[n][m] = 0;
			return dp[n][m];
		}
		
		if(s1.charAt(n-1) == s2.charAt(m-1)){
			dp[n][m] = 1+getLengthOfLCSUtil(s1,s2,n-1,m-1,dp);
		}
		
		else{
			dp[n][m] = Math.max(getLengthOfLCSUtil(s1,s2,n,m-1,dp), getLengthOfLCSUtil(s1,s2,n-1,m,dp));
		}
		
		return dp[n][m];
	}
	
	int getLengthOfLCS(String s1, String s2) {
		// add your logic here
		
		int n = s1.length();
		int m = s2.length();
		
		int [][] dp = new int[n+1][m+1]; 
		
		for(int i=0;i<=n;i++){
			Arrays.fill(dp[i],-1);
		}
		return getLengthOfLCSUtil(s1,s2,n,m,dp);
	}
}
