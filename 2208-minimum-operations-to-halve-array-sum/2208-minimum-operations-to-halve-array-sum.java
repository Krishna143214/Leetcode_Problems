import java.util.PriorityQueue;
import java.util.Collections;

class Solution {
    public int halveArray(int[] nums) {
PriorityQueue<Double> kk=new PriorityQueue<>(Collections.reverseOrder());
double s=0;

for(int i=0;i<nums.length;i++){
    s=s+nums[i];
    kk.add((double)nums[i]);
}


double j=s/2;
int res=0;


while(s>j){
    res++;
    double a=kk.poll();
    double b=a/2;
    kk.add(b);
    s=s-b;
}

return res;
        
    }
}