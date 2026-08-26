class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashSet<Integer> n=new HashSet<>();
        for(int num:nums){
            n.add(num);
        }
        int prod=k;
        while(n.contains(prod)){
            prod+=k;
        }
        return prod; 
    }
}