import java.util.PriorityQueue;
import java.util.Collections;

class Solution {
    public int halveArray(int[] nums) {
PriorityQueue<Double> kk=new PriorityQueue<>(Collections.reverseOrder());

double s=0;

for(int i=0;i<nums.length;i++){
    kk.add((double)nums[i]);
    s=s+nums[i];
}


double c=s;

int ans=0;

while(c>s/2){
    double m=kk.poll();
  
    double n=m/2;
c=c-n;
    if(n<=0){

    }

    else{
        kk.add(n);
    }

    ans++;
}

return ans;
        
    }
}