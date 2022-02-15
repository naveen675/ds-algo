class Solution{
  
  static long powerUtil(int base,int power,int [] dp) {
		
		for(int i=0;i<=power;i++) {
			
			
			if(i == 0) {
				dp[i] =1;
			}
			else {
				dp[i] = base*dp[i-1];
			}
		}
		return dp[power];
		
	
		
	}
	
	static long power(int base,int power) {
		
		int [] dp = new int[power+1];
		
		if(base == 0 || base == 1) {
			return base;
		}
		
		return powerUtil(base,power,dp);
	}
}
