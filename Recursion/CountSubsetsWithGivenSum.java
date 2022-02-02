static int subsetSum(int [] arr,int n,int target) {
		
		if(target == 0) {
			return 1;
		}
		
		if(n == 0) {
			return 0;
		}
		
		
		if(arr[n-1] <= target) {
			
			return subsetSum(arr,n-1,target-arr[n-1]) + subsetSum(arr,n-1,target);
		}
		
		else {
			return subsetSum(arr,n-1,target);
		}
		
	} 
