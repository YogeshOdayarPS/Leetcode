class Solution {
    public boolean isAnagram(String s, String t) {
        ArrayList<Character> c=new ArrayList<>();
        if(s.length()!=t.length()){
            return false;
        }
        for(int i=0;i<s.length();i++){
            c.add(s.charAt(i));
        }
        for(int i=0;i<t.length();i++){
            char ch=t.charAt(i);
            if(c.contains(ch)){
                c.remove((Character)ch);
            }
            else{
                return false;
            }


        }
        return c.isEmpty();
    }
}