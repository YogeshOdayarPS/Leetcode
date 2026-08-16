class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int sum=0;//sum
        int left=0;//left   [1,2]
        int count=0;
        int prod=1;
        if(nums.length==1){
            return 0;
        }
        if(nums.length==k){
            return 1;
        }
        for(int right=0;right<nums.length;right++){
            prod*=nums[right];
            while(prod > k){//conditionnn
                prod/=nums[left];
                left++;
            }
            count+=right-left+1;
        }
        
       return count;
    }
}