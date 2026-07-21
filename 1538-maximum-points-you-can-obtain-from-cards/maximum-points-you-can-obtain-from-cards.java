class Solution {
    public int maxScore(int[] cardPoints, int k) {
        
        int maxSum=0;
        int windowSum=0;

        for(int i=0;i<k;i++){
            windowSum+=cardPoints[i];
        }
        maxSum=windowSum;

         for (int i = 1; i <= k; i++) {

            windowSum -= cardPoints[k - i];      
            windowSum += cardPoints[cardPoints.length - i];      

            maxSum = Math.max(maxSum, windowSum);
        }
        return maxSum;
    }
}