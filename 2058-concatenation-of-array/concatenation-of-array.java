class Solution {
    public int[] getConcatenation(int[] nums) {
        ArrayList<Integer> in = new ArrayList<>();
        ArrayList<Integer> t=new ArrayList<>();

        for(int i=0;i<nums.length;i++){
            in.add(nums[i]);
        }
        for(int val:in){
            t.add(val);
        }
        for(int val: in){
            t.add(val);
        }
        int[] result=new int[t.size()];
        for(int i=0;i<t.size();i++){
            result[i]=t.get(i);
        }
        return result;
    }
}