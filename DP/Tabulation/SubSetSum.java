class Solution {
	
	boolean hasValidSubsetUtil(int [] A,int n,int target,boolean [][] dp){
		
		for(int i=0;i<=n;i++){
			for(int j=0;j<=target;j++){
				
				if(j == 0){
					dp[i][j] = true;
				}
				
				else if(i == 0){
					dp[i][j] = false;
				}
				
				
				else{
					if(A[i-1] <= j){
						dp[i][j] = ( dp[i-1][j-A[i-1]] || dp[i-1][j] );
					}
					else{
						dp[i][j] = dp[i-1][j];
					}
				}
			}
		}
		return dp[n][target];
	}
	
	boolean hasValidSubset(int[] A, int target) {
	    // add your logic here
		
		int n = A.length;
		boolean [][] dp = new boolean [n+1][target+1]; 
		return hasValidSubsetUtil(A,n,target,dp);
	}
}
