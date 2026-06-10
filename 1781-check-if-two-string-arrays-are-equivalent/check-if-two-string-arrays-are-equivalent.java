class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String res=" "; 
        String res1=" ";
        for(int i=0;i<word1.length;i++){
            res+=word1[i];

        }
        for(int i=0;i<word2.length;i++){
            res1+=word2[i];

        }
        if(res.equals(res1)){
            return true;
        }
        else{
            return false;
        }
    }
}