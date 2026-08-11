class Solution {
    public int removeElement(int[] nums, int val) {
        ArrayList<Integer> a =new ArrayList<Integer>();
        
        for (int num:nums){
                if(num!=val){
                    a.add(num);
            }
        }
        for(int i=0;i<a.size();i++){
            nums[i]=a.get(i); 
        }
        return a.size();
    }
}