class Solution {
    public int heightChecker(int[] heights) {
        int count=0;
        int[] n=new int[heights.length];

        for(int i=0;i<heights.length;i++){
            n[i]=heights[i];
        }
        Arrays.sort(n);
        for(int i=0;i<heights.length;i++){
            if(heights[i]!=n[i]){
                count++;
            }

        }
        return count;
    }
}