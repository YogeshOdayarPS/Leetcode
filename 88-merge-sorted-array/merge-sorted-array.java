class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
       ArrayList<Integer> a =new ArrayList<Integer>();
       for(int i=0;i<m;i++){
        a.add(nums1[i]);
       } 
       for(int num:nums2){
        a.add(num);
       }
       Collections.sort(a);
    for(int i=0;i<a.size();i++){
        nums1[i]=a.get(i);
    }
    }

}