static int subsetSumUtil(int [] arr,int n,int target,int [][] dp) {
		
		if(dp[n][target] != -1) {
      
			return dp[n][target];
		}
		
		if(target == 0) {
			dp[n][target] = 1;
			return dp[n][target];
		}
		
		if(n == 0) {
			dp[n][target] = 0;
			return dp[n][target];
		}
		if(arr[n-1] <= target) {
			
			dp[n][target] = subsetSum(arr,n-1,target-arr[n-1],dp) + subsetSum(arr,n-1,target,dp);
		}
		
		else {
			dp[n][target] = subsetSum(arr,n-1,target,dp);
		}
  
		return dp[n][target];
	}

static int subsetSum(int [] arr,int target) {
  
  int n = arr.length;
  int [][] dp = new int[n+1][targett+1];
  
		for(int i=0;i<=n;i++) {
			for(int j=0;j<=target;j++) {
				Arrays.fill(dp[i], -1);
			}
		}
  return subsetSumUtil(arr,n,target,dp);
}
