class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }

        int i=0;
        int[] res=new int[2];
        for(int key:map.keySet()){
            if(map.get(key)==2){
                res[i]=key;
                i++;
            }
        }
        return res;
    }
}