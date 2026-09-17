import java.util.PriorityQueue;
import java.util.Collections;

class Solution {
    public long maxKelements(int[] nums, int k) {

long res=0;

PriorityQueue<Double> kk=new PriorityQueue<>(Collections.reverseOrder());

for(int a:nums){
    kk.add((double)a);
}

for(int i=0;i<k;i++){
    double b=kk.poll();
    res=res+(long)b;

    double r=Math.ceil(b/3);

    kk.add(r);

}


return res;


        
    }
}