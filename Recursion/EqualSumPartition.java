static boolean equalPartitionUtil(int [] arr,int n,int target) {
		
		if(target == 0) {
			return true;
		}
		
		if(n == 0) {
			return false;
		}
		
		if(arr[n-1] <= target) {
			
			return equalPartitionUtil(arr,n-1,target-arr[n-1]) || equalPartitionUtil(arr,n-1,target);
		}
		else {
			return equalPartitionUtil(arr,n-1,target);
		}
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
		return equalPartitionUtil(arr,n,sum/2);	
	}
