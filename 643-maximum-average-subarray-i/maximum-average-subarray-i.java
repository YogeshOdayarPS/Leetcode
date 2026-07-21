class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double maxavg=0;
        int windowsum=0;
        
        for(int i=0;i<k;i++){
            windowsum+=nums[i];

        }
        double avg=(double)windowsum/k;
        maxavg=avg;

        for(int i=k;i<nums.length;i++){
            windowsum+=nums[i]-nums[i-k];
            avg=(double)windowsum/k;
            maxavg=Math.max(maxavg,avg);
        }
        return maxavg;
    }
}