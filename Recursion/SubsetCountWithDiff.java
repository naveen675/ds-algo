Class Solution{
  
  static int countOfSubsetUtil(int [] arr,int n,int target) {
		
		if(target == 0) {
			return 1;
		}
		if(n == 0) {
			return 0;
		}
		
		if(arr[n-1] <= target) {
			
			return countOfSubsetUtil(arr,n-1,target-arr[n-1])+countOfSubsetUtil(arr,n-1,target);
		}
		else {
			return countOfSubsetUtil(arr,n-1,target);
		}
	}
	
	static int countOfSubsetDifference(int [] arr,int diff) {
		
		int sum =0;
		int n = arr.length;
		
		for(int i=0;i<n;i++) {
			
			sum = sum + arr[i];
		}
		
		int target = (sum + diff)/2;
		
		return countOfSubsetUtil(arr,n,target);
	}

  
}
