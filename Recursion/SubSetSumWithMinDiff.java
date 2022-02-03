Class Solution{

  static boolean mindiffUtil(int [] arr,int n,int target) {
		
		if(target == 0) {
			return true;
		}
		
		if(n == 0) {
			return false;
		}
		
		if(arr[n-1] <= target) {
			return mindiffUtil(arr,n-1,target-arr[n-1]) || mindiffUtil(arr,n-1,target);
		}
		
		else {
			return mindiffUtil(arr,n-1,target);
		}
	}
	
	static int mindiff(int [] arr) {
		
		int sum =0;
		int n = arr.length;
		for(int i=0;i<n;i++) {
			sum = sum + arr[i];
		}
		
		int target = sum/2;
		int min = -1;
		for(int i=0;i<=target;i++) {
			
			if(mindiffUtil(arr,n,i)) {
				
				min = sum - 2*i;
			}
		}
		return min;
	}


}
