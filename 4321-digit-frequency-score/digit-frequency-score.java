class Solution {
    public int digitFrequencyScore(int n) {
        char[] arr = String.valueOf(n).toCharArray();
        HashMap<Character,Integer>map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        int sum=0;int g=0;
        for(char val:map.keySet()){
            int f1=map.getOrDefault(val,0);
            g=(val-'0')*f1;
            sum+=g;
        }
        
    return sum;
    }
}