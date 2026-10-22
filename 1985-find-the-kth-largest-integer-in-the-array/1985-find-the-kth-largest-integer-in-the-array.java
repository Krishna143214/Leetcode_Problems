import java.util.PriorityQueue;
import java.util.Collections;
class Solution {
    public String kthLargestNumber(String[] nums, int k) {

        PriorityQueue<pair> ll=new PriorityQueue<>(

            (a,b) ->{
                

                if(a.l!=b.l){
                    return b.l-a.l;
                }

             


               for(int i=0;i<a.l;i++){
                if(a.v.charAt(i)!=b.v.charAt(i)){
                    return b.v.charAt(i)-a.v.charAt(i);
                }


               }

               return 0;


            }
        );


        for(String a:nums){

            ll.add(new pair(a,a.length()));

        }


        for(int i=1;i<k;i++){
            ll.poll();
        }
      

      return ll.peek().v;
        
    }
}

class pair{
    String v;
    int l;


    pair(String a,int b){
        v=a;
        l=b;
    }
}