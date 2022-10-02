class Solution {
    public int maximumWealth(int[][] accounts) {
        
        int richestCustWealth=0,sum=0;
        int colLength = accounts.length;
        
        for(int i=0; i<colLength; i++){
                sum =0;
            for(int j=0; j<accounts[i].length;j++){
                sum = sum + accounts[i][j];
            }
            
            if(sum > richestCustWealth){
                richestCustWealth = sum;
            }
        }
        return richestCustWealth;
        
         }
    
}
