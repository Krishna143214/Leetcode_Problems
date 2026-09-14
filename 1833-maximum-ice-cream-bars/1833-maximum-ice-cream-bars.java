import java.util.PriorityQueue;
import java.util.Collections;
class Solution {
    public int maxIceCream(int[] costs, int coins) {

        PriorityQueue<Integer> kk=new PriorityQueue<>();


        for(int a:costs){
            kk.add(a);
        }

        int c=0;

        while(coins>0&&!kk.isEmpty()){
            coins=coins-kk.poll();

            if(coins>=0){
            c++;}
        }
        return c;
    }
}