import java.util.Arrays;

class Solution {
    public int[] numberGame(int[] nums) {
        int numArrLength = nums.length;
        int[] ar = new int[numArrLength];
        Arrays.sort(nums);
        ar = Arrays.copyOf(nums, numArrLength);      
        for (int i=0; i<numArrLength; i+=2){
            
            int temp = ar[i];
            ar[i] = ar[i+1];
            ar[i+1] = temp;
        }
        return ar;
    }
}