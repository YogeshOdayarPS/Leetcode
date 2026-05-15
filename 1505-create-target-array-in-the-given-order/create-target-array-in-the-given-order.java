class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer> list1=new ArrayList<>();
        ArrayList<Integer> list2=new ArrayList<>();
        ArrayList<Integer> target=new ArrayList<>();
        for(int num: nums ){
            list1.add(num);
        }
        for(int n: index){
            list2.add(n);
        }
        for(int i=0;i<index.length;i++){
            target.add(list2.get(i),list1.get(i));
        }
        int[] res=new int[target.size()];
        for(int i=0;i<target.size();i++){
            res[i]=target.get(i);
        }
        return res;
    }
}