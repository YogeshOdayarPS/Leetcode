class Solution {
    public int maxProfit(int[] prices) {
        int[] res=new int[prices.length];
      for(int i = 1; i < prices.length; i++) {
            res[i - 1] = prices[i] - prices[i - 1];
        }
      int max=res[0];
      int sum=0;
      for(int i=0;i<res.length;i++){
        sum+=res[i];
        max=Math.max(sum,max);
        if(sum<0){
            sum=0;
        }
      }
      return max;
    }
    
    
}