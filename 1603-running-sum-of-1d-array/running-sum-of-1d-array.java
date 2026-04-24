class Solution {
    public int[] runningSum(int[] nums) {
        ArrayList<Integer> h=new ArrayList<>();
        
        h.add(nums[0]);
        for(int i=1;i<nums.length;i++){
            h.add(h.get(i-1)+nums[i]);
       }
        int[] result = new int[h.size()];
        for(int i=0;i<h.size();i++){
            result[i]=h.get(i);
        }
        return result;
    }
}