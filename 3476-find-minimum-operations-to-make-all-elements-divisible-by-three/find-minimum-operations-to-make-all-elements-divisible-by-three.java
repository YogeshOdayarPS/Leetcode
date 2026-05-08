class Solution {
    public int minimumOperations(int[] nums) {
       int sum=0;
       int count=0;
       for(int num:nums){
        if(num%3!=0){
            count++;
        }
       }
       return count;
    }
}
