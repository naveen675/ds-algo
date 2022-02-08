class Solution {
	
	void generateParenthesesUtil(int close,int open,List<String> sets,StringBuilder str,int length){
		
		if(str.length() == 2*length){
			sets.add(str.toString());
			return;
		}
		
		if(open < length ){
			str.append("(");
			generateParenthesesUtil(close,open+1,sets,str,length);
			str.deleteCharAt(str.length()-1);
			
		}
		if(close < open){
			str.append(")");
			generateParenthesesUtil(close+1,open,sets,str,length);
			str.deleteCharAt(str.length()-1);
		}
		
	}
	
	List<String> generateParentheses(int n) {
	    // add your logic here
		
		int close =n;
		int open =n;
		List<String> sets = new ArrayList<>();
		int length = n;
		generateParenthesesUtil(0,0,sets,new StringBuilder(),n);
		return sets;
	}
}
