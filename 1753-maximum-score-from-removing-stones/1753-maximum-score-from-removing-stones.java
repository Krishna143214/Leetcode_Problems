import java.util.PriorityQueue;
import java.util.Collections;

class Solution {
    public int maximumScore(int a, int b, int c) {

     PriorityQueue<Integer> kk=new PriorityQueue<>(Collections.reverseOrder());
     kk.add(a);
     kk.add(b);
     kk.add(c);

     int d=0;

     while(kk.size()>1){
        int f=kk.poll()-1;
        int n=kk.poll()-1;

        if(f<=0){

        }
        else{
            kk.add(f);
        }


         if(n<=0){

        }
        else{
            kk.add(n);
        }
        d++;

     }


     return d;
        
    }
}