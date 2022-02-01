static boolean equalPartitionUtil(int [] arr,int n,int target,int [][] dp) {
		
		for(int i=0;i<=n;i++) {
			for(int j=0;j<=target;j++) {
				
				if(j == 0) {
					dp[i][j] = 1;
				}
				else if(i == 0 ) {
					dp[i][j] = 0;
				}
				else {
					
					if(arr[i-1] <= j) {
						
						dp[i][j] = Math.max(dp[i-1][j-arr[i-1]], dp[i-1][j]);
					}
					else {
						dp[i][j] = dp[i-1][j];
					}
				}
			}
		}
		return dp[n][target] == 1;
		
	}
	
	static boolean equalPartition(int [] arr) {
		
		int sum=0;
		int n = arr.length;
		for(int i=0;i<arr.length;i++) {
			sum = sum + arr[i];
		}
		
		if(sum %2 != 0) {
			return false;
		}
		int target = sum/2;
		int [][] dp = new int [n+1][target+1];
		
		return equalPartitionUtil(arr,n,sum/2,dp);
	}
