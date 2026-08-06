class Solution {
    public int smallestNumber(int n, int t) {
        
      while(true){
        int x=n;
        int prod=1;
        while(x>0){
            int dig=x%10;
            prod=prod*dig;
            x/=10;
        }
        if(prod%t==0){
            return n;
        }
        n++;
      }
      //return 0;
    }
}