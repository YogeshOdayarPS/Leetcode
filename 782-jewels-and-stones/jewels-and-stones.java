class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        char[] arr=stones.toCharArray();
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        int f1=0;
        int sum=0;
        for(int i=0;i<jewels.length();i++){
            char ch=jewels.charAt(i);
            if(map.containsKey(ch)){
                   f1=map.get(ch);
                    sum+=f1;
            }
        
        }
        return sum;
    }
}