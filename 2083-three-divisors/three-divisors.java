class Solution {
    public boolean isThree(int n) {
        int m=1;
        int k=1;
        int c=0;
        int original=n;
        for(k=1;k<=n;k++){ //2
            for(m=1;m<=n;m++){//3
            original=k*m; //3*2=6
            
            if(original==n){//2==4
                c++;
                
            }
            }
            
        }
        if(c==3){
            return true;
        }
        else{
            return false;
        }
    }
}