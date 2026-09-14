import java.util.PriorityQueue;
import java.util.Collections;

class Solution {
    public int maximumScore(int a, int b, int c) {

  PriorityQueue<Integer> kk=new PriorityQueue<>(Collections.reverseOrder());


  kk.add(a);
  kk.add(b);
  kk.add(c);

  int cc=0;


  while(kk.size()>1){
    int aa=kk.poll();
    int bb=kk.poll();

    if(aa<=1){
      
    }
    else{
          kk.add(aa-1);
    }
   if(bb<=1){

   }
   else{
    kk.add(bb-1);
   }
    cc++;
  }

  return cc;
        
    }
}