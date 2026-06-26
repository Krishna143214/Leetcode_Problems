import java.util.PriorityQueue;
import java.util.Collections;
import java.util.ArrayList;


class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {



PriorityQueue<pair> kk=new PriorityQueue<>(
  (a,b)->{
if(a.diff!=b.diff){
    return a.diff-b.diff;
}
return a.val-b.val;



}

);


for(int i=0;i<arr.length;i++){
    kk.add(new pair(arr[i],Math.abs(arr[i]-x)));
}

ArrayList<Integer> nn=new ArrayList<>();

for(int i=0;i<k;i++){

    pair l=kk.poll();
   nn.add(l.val);
}

Collections.sort(nn);

return nn;
      



}

}

class pair{
    int val;
    int diff;

    pair(int a,int b){
        val=a;
        diff=b;
    }
}