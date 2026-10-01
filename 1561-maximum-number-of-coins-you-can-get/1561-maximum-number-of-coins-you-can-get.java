import java.util.Arrays;
class Solution {
    public int maxCoins(int[] piles) {
        Arrays.sort(piles);

        int i=0;
        int j=piles.length-1;
        int k=piles.length-2;
int c=0;
        while(i<k){
            c=c+piles[k];
            i++;
            j=j-2;
            k=k-2;
        }


        return c;

    }
}