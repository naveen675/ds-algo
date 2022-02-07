class Solution {
	
	static int minDiff =Integer.MAX_VALUE;
	
	void divideGroupUtil(int [] A,ArrayList<Integer> s1,ArrayList<Integer> s2,int index,int sum1,int sum2,int n){
		
		if(index == n){
			
			if(minDiff > Math.abs(sum1-sum2)){
				minDiff = Math.abs(sum1-sum2);
			}
			return;
		}
		
		if(s1.size() < (n+1)/2){
			
			s1.add(A[index]);
			divideGroupUtil(A,s1,s2,index+1,sum1+A[index],sum2,n);
			s1.remove(s1.size()-1);
		}
		if(s2.size() < (n+1)/2){
			
			s2.add(A[index]);
			divideGroupUtil(A,s1,s2,index+1,sum1,sum2+A[index],n);
			s2.remove(s2.size()-1);
		}
	}
	int divideGroup(int[] A) {
	    // add your logic here
		
		ArrayList<Integer> s1 = new ArrayList<>();
		ArrayList<Integer> s2 = new ArrayList<>();
		minDiff =Integer.MAX_VALUE;
		divideGroupUtil(A,s1,s2,0,0,0,A.length);
		return minDiff;
	}
}
