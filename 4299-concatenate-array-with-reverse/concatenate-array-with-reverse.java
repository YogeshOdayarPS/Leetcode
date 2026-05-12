class Solution {
    public int[] concatWithReverse(int[] nums) {
        int n=nums.length;
        int[] ans=new int[2*nums.length];
        int i=0;
        for(int num: nums){
            ans[i]=num; 
            i++; 
        }
        int k=n;
        for( i=nums.length-1;i>=0;i--){
             
            ans[k]=nums[i]; 
            k++;
        } 
        return ans; 
    }
}