import java.util.PriorityQueue;
import java.util.Collections;


class Solution {
    public int lastStoneWeight(int[] stones) {

        PriorityQueue<Integer> kk=new PriorityQueue<>(Collections.reverseOrder());

        for(int i=0;i<stones.length;i++){
            kk.add(stones[i]);
        }

        int val=0;

        while(kk.size()>1){
            int a=kk.poll();
            int b=kk.poll();

           
                kk.add(a-b);
            
        }



return kk.peek();
       
        
    }
}