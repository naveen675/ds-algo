	static boolean equalPartitionUtil(int [] arr,int n,int target,int [][] dp) {
	
		if(dp[n][target] != -1) {
			return dp[n][target] == 1;
		}
		if(target == 0) {
			
			dp[n][target] = 1;
			return true;
		}
		
		if(n == 0) {
			dp[n][target] = 0;
			return false;
		}
		
		if(arr[n-1] <= target) {
			
			dp[n][target] =  equalPartitionUtil(arr,n-1,target-arr[n-1],dp) || equalPartitionUtil(arr,n-1,target,dp) ? 1 : 0;
		}
		else {
			dp[n][target] = dp[n-1][target];
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
		
		for(int i=0;i<=n;i++) {
			Arrays.fill(dp[i], -1);
		}
		
		return equalPartitionUtil(arr,n,sum/2,dp);	
	}
