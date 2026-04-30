class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        int j=1;
        for(int i=0;i<nums.length-1;i+=2){
            if(nums[i]==nums[j]){
                j+=2;
            }
            else{
                return nums[i];
            }
        }
        return nums[nums.length-1];
    }
}