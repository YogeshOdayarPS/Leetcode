class Solution {
    public int romanToInt(String s) {
        HashMap<Character,Integer> n =new HashMap<>();

        n.put('I',1);
        n.put('V',5);
        n.put('X',10);
        n.put('L',50);
        n.put('C',100);
        n.put('D',500);
        n.put('M',1000);
        int ans=0;
        for(int i=0;i<s.length()-1;i++){
            

            if(n.get(s.charAt(i))<n.get(s.charAt(i+1))){
                ans-=n.get(s.charAt(i));
            }
            else{
                ans+=n.get(s.charAt(i));
            }
            
        }
        ans+=n.get(s.charAt(s.length()-1));
            return ans;
    }
}