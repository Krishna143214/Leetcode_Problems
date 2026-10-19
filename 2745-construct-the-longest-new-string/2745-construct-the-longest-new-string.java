
class Solution {
    public int longestString(int x, int y, int z) {


        int a=(Math.min(x,y)*2+z)*2;


        if(x!=y){
            a=a+2;
        }


        return a;
        
    }
}