class Solution{
  
  static int countOfSubsetUtil(int [] arr,int n,int target,int [][]dp) {
				
		for(int i=0;i<=n;i++) {
			for(int j=0;j<=target;j++) {
				
				if(j == 0) {
					dp[i][j] = 1;
				}
				else if(i == 0) {
					dp[i][j] = 0;
				}
				
				else {
					
					if(arr[i-1] <= j) {
						
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
	
	static int countOfSubsetDifference(int [] arr,int diff) {
		
		int ArraySum =0;
		int lengthOfArray = arr.length;
		
		
		for(int i=0;i<lengthOfArray;i++) {
			
			ArraySum = ArraySum + arr[i];
		}
		
		int target = (ArraySum + diff)/2;
		
		int [][] dp = new int [lengthOfArray+1][target+1];
		
		
		return countOfSubsetUtil(arr,lengthOfArray,target,dp);
	}
  
}
