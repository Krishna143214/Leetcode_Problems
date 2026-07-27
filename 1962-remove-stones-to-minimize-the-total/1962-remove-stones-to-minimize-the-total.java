import java.util.PriorityQueue;

import java.util.Collections;

class Solution {
    public int minStoneSum(int[] piles, int k) {

        PriorityQueue<Integer> kk=new PriorityQueue<>(Collections.reverseOrder());

        for(int i=0;i<piles.length;i++){
            kk.add(piles[i]);
        }

        for(int i=0;i<k;i++){
            int a=kk.poll();
            int val=a/2;

            if(a%2!=0){
                val++;
            }
            if(val<=0){

            }
            else{
                kk.add(val);
            }        }


            int c=0;

            while(!kk.isEmpty()){
                c=c+kk.poll();
            }


            return c;

    }
}