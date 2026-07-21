class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n=cardPoints.length;
        int maxsum=0;
        int windowsum=0;
        for(int i=0;i<k;i++){
            windowsum+=cardPoints[i];
        }
        maxsum=windowsum;

        for(int i=1;i<=k;i++){
            windowsum-=cardPoints[k-i];
            windowsum+=cardPoints[n-i];
            maxsum=Math.max(maxsum,windowsum);
        }
        return maxsum;
    }
}