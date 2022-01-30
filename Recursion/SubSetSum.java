class Solution {
	
	boolean hasValidSubsetUtil(int [] A,int target,int n){
		
		if(target == 0){ return true;}
		
		if(n == 0){ return false;}
		
		
		if(A[n-1] <= target){
			
			return (hasValidSubsetUtil(A,target-A[n-1],n-1) || hasValidSubsetUtil(A,target,n-1));
		
		}
		
		else{
			return hasValidSubsetUtil(A,target,n-1);
		}
	}
	
	boolean hasValidSubset(int[] A, int target) {
	    // add your logic here
		
		int n = A.length;
		
		return hasValidSubsetUtil(A,target,n);
	}
}
