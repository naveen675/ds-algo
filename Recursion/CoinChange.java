class Solution {
	
	int numberOfCombinationsUtil(int [] coins,int n,int target){
		
		if(target == 0){
			return 1;
		}
		
		if(n == 0){
			return 0;
		}
		
		if(coins[n-1] <= target){
			
			return numberOfCombinationsUtil(coins,n,target-coins[n-1]) + numberOfCombinationsUtil(coins,n-1,target);
		}
		else{
			return numberOfCombinationsUtil(coins,n-1,target);
		}
	}
	
	int numberOfCombinations(int[] coins, int target) {
	    // add you logic here
		
		int n = coins.length;
		
		return numberOfCombinationsUtil(coins,n,target);
	}
}
