import java.util.PriorityQueue;
import java.util.Collections;
class Solution {
    public boolean stoneGame(int[] piles) {

        PriorityQueue<Integer> kk=new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<piles.length;i++){
            kk.add(piles[i]);
        }
        int ca=0;
        int cb=0;

        while(!kk.isEmpty()){
            ca=ca+kk.poll();
            cb=cb+kk.poll();
        }

        if(ca>cb){
            return true;
        }
        return false;
    }
}