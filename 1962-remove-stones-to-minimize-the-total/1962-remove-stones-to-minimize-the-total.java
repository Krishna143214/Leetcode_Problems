import java.util.PriorityQueue;

import java.util.Collections;

class Solution {
    public int minStoneSum(int[] piles, int k) {

     PriorityQueue<Integer> kk=new PriorityQueue<>(Collections.reverseOrder());


     for(int i=0;i<piles.length;i++){
        kk.add(piles[i]);
     }


     for(int i=0;i<k;i++){
        int kkk=kk.poll();
        
        int b=kkk/2;

        
            if(kkk%2!=0){
                 kk.add(b+1);
            }
            else{
            kk.add(b);}
        
     }


     int c=0;

     while(!kk.isEmpty()){
        c=c+kk.poll();
     }


     return c;

    }
}