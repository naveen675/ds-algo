Class Solution{
  
  static int countOfSubsetUtil(int [] arr,int n,int target,int [][]dp) {
		
		if(dp[n][target] != -1) {
			return dp[n][target];
		}
		
		if(target == 0) {
			
			dp[n][target] = 1;
			return dp[n][target];
		}
		if(n == 0) {
			
			dp[n][target] =0;
			return dp[n][target];
		}
		
		if(arr[n-1] <= target) {
			
			dp[n][target] = countOfSubsetUtil(arr,n-1,target-arr[n-1],dp)+countOfSubsetUtil(arr,n-1,target,dp);
		}
		else {
			dp[n][target] = countOfSubsetUtil(arr,n-1,target,dp);
		}
		
		return dp[n][target];
	}
  
  
	
	static int countOfTargetSumDiff(int [] arr,int diff) {
		
		int ArraySum =0;
		int lengthOfArray = arr.length;
		
		
		for(int i=0;i<lengthOfArray;i++) {
			
			ArraySum = ArraySum + arr[i];
		}
		
		int target = (ArraySum + diff)/2;
		
		int [][] dp = new int [lengthOfArray+1][target+1];
		
		for(int i=0;i<=lengthOfArray;i++) {
			for(int j=0;j<=target;j++) {
				
				Arrays.fill(dp[i], -1);
			}
		}
		
		return countOfSubsetUtil(arr,lengthOfArray,target,dp);
	}
  
}
