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
    int dif=Math.abs(arr[i]-x);
    kk.add(new pair(arr[i],dif));
}

ArrayList<Integer> s=new ArrayList<>();

for(int i=0;i<k;i++){
   pair g=kk.poll();
    s.add(g.val);
}

Collections.sort(s);
return s;



      



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

