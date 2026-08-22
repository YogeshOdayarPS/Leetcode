class Solution {
    public int lengthOfLastWord(String s) {
        s=s.trim();
        int count=0;
        for(int j=s.length()-1;j>=0;j--){
            if(s.charAt(j)==' '){
                return count;
            }
            else{
                count++;
            }
        }
        return count;
    }
}