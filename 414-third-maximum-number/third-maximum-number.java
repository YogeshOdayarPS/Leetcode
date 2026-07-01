class Solution {
    public int thirdMax(int[] nums) {
        int max,currmax=0;
        Arrays.sort(nums);
        for (int i = 0, j = nums.length - 1; i < j; i++, j--) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
        }
        int count=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[i-1]){
                count++;

            }
            if(count==3){
                return nums[i];
            }
        }

        
        return nums[0];
    }
}