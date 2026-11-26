class Solution {
    public boolean canAliceWin(int n) {
        int k=10;
int a=0;

        while(true){
            n=n-k;
            k--;
            if(n<0){
                break;
            }
            a++;
            

        }

        if(a%2!=0){
            return true;
        }

        return false;
        
    }
}