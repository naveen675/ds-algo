static int subsetSumUtil(int [] arr,int n,int target,int [][] dp) {
		
		for(int i=0;i<=n;i++) {
			for(int j=0;j<=target;j++) {
				
				if(j == 0) {
					dp[i][j] =1;
				}
				
				else if(i == 0) {
					dp[i][j] =0;
				}
				
				else {
					if(arr[i-1]<= j) {
						dp[i][j] = dp[i-1][j-arr[i-1]] + dp[i-1][j];
					}
					
					else {
						dp[i][j] = dp[i-1][j];
					}
				}
				
			}
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
