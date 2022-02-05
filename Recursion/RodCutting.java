class Solution{
  
  static int rodCuttingUtil(int [] prices,int n,int lengthOfRod) {
		
		if(n == 0 || lengthOfRod == 0) {
			return 0;
		}
		
		if(n <= lengthOfRod) {
			
			return Math.max(rodCuttingUtil(prices,n,lengthOfRod-n)+prices[n-1],rodCuttingUtil(prices,n-1,lengthOfRod));
		}
		else {
			return rodCuttingUtil(prices,n-1,lengthOfRod);
		}
	}
  
	static int rodCutting(int [] prices,int lengthOfRod) {
		
		int n = lengthOfRod;
		
		return rodCuttingUtil(prices,n,lengthOfRod);
	}
  
}
