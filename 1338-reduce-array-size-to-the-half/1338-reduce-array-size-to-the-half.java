import java.util.HashMap;

import java.util.PriorityQueue;
import java.util.Collections;

class Solution {
    public int minSetSize(int[] arr) {
   HashMap<Integer,Integer> kk=new HashMap<>();

   for(int i=0;i<arr.length;i++){
    if(kk.containsKey(arr[i])){
        kk.put(arr[i],kk.get(arr[i])+1);
    }
    else{
        kk.put(arr[i],1);
    }
   }

   PriorityQueue<Integer> oo=new PriorityQueue<>(Collections.reverseOrder());
  int s=arr.length;
   for(Map.Entry<Integer,Integer> ll:kk.entrySet()){
    oo.add(ll.getValue());

   }
   int c=0;

   while(s>arr.length/2){
    s=s-oo.poll();
    c++;
   }

   return c;


        
    }
}

