// https://leetcode.com/problems/decompress-run-length-encoded-list/solutions/4202063/java-solution-with-clean-code/

class Solution {
    public int[] decompressRLElist(int[] nums) {

        int numLength = nums.length;
        int totalFreq = 0;

        for(int i=0; i<numLength; i= i+2){  totalFreq = totalFreq+nums[i];  }

        int [] decompList = new int[totalFreq];

        int index = 0;

        for(int i=0; i<numLength; i = i+2 ){

                int freq = nums[i];
                int value = nums[i+1];

                while( freq > 0 ){

                    decompList[index++] = value ;

                    freq--;
                }

        }

        return decompList;
        
    }
}