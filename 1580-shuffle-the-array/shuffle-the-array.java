class Solution {
    public int[] shuffle(int[] nums, int n) {
        ArrayList<Integer> list1=new ArrayList<>();
        ArrayList<Integer> list2=new ArrayList<>();
        ArrayList<Integer> list3=new ArrayList<>();
        for(int i=0;i<nums.length/2;i++){
            list1.add(nums[i]);
        }
        for(int i=n;i<nums.length;i++){
            list2.add(nums[i]);
            

        }
        for(int i=0;i<n;i++){
            list3.add(list1.get(i));
            list3.add(list2.get(i));

        }
        int[] result=new int[list3.size()];
        for(int i=0;i<list3.size();i++){
            result[i]=list3.get(i);
        }
        return result;
        
    }
}