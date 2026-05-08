class Solution {
    public int countPairs(List<Integer> nums, int target) {
        ArrayList<Integer> list=new ArrayList<>();
        int count=0;
        
        for(int num:nums){
            list.add(num);
        }
        for(int i=0;i<list.size();i++){
            for(int j=i+1;j<list.size();j++){
            if(list.get(i)+list.get(j)<target){
                count++;
            }
        }
        }
        
        return count;
    }
}