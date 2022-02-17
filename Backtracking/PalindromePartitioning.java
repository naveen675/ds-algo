class Solution {
	
	boolean isPalindrome(String s,int start,int end){
		
		while(start <= end){
			
			if(s.charAt(start) != s.charAt(end)){
				return false;
			}
			start++;
			end--;
		}
		return true;
	}
	
	void getPartitionsUtil(String s,int start,int end,List<String>arr, List<List<String>>ans){   //abbc
		
		if(start == s.length()){
			ans.add(new ArrayList(arr));
			return;
		}
		if(end > s.length()){
			return;
		}
		
		String sub = s.substring(start,end);
		if(isPalindrome(s,start,end-1)){
			
			arr.add(sub);
			getPartitionsUtil(s,end,end+1,arr,ans);
			arr.remove(arr.size()-1);
		}
		
		
		
		getPartitionsUtil(s,start,end+1,arr,ans);
		
	}
	
	List<List<String>> getPartitions(String s) {
	    // add logic here
		
		List<List<String>> ans = new ArrayList<>();
		List<String> arr = new ArrayList<>();
		
		int start = 0;
		int end =1;
		getPartitionsUtil(s,start,end,arr,ans);
		
		return ans;
	}
}
