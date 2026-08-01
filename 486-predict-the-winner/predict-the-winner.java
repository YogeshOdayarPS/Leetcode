class Solution {

    public boolean predictTheWinner(int[] nums) {

        int total = 0;

        for(int x : nums){
            total += x;}

        int player1 = solve(nums,0,nums.length-1,true);

        return player1 >= total - player1;
    }

    public int solve(int[] nums,int i,int j,boolean turn){

        if(i>j)
            return 0;

        if(turn){

            int left = nums[i] + solve(nums,i+1,j,false);

            int right = nums[j] + solve(nums,i,j-1,false);

            return Math.max(left,right);

        }else{

            int left = solve(nums,i+1,j,true);

            int right = solve(nums,i,j-1,true);

            return Math.min(left,right);
        }
    }
}