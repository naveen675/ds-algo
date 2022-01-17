import java.util.*;

public class Combination{
	
	static String [] keyBoard = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
	
	public static void letterCombinationUtil(String number,int index,int length,StringBuilder str,List<String> sets){
		
		if(index == length){
			sets.add(str.toString());
		}
		else{
			int n = number.charAt(index)-'0';
			String temp = keyBoard[n];
			
			for(int i=0;i<temp.length();i++){
				
				str.append(temp.charAt(i));
				letterCombinationUtil(number,index+1,length,str,sets);
				str.deleteCharAt(str.length()-1);
			}
			
		}
	}
	
	
	
	public static List<String> letterCombination(String number){
		
		List<String> sets = new ArrayList<>();
		
		int index= 0;
		int length = number.length();
		letterCombinationUtil(number,index,length,new StringBuilder(),sets);
		return sets;
	}
	
	
	
	public static void main(String [] args){
		
		
		String number = "234";
		List<String> sets = letterCombination(number);
		
		System.out.println(sets);
		
		
		
	}
}