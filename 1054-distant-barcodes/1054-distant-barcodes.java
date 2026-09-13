import java.util.HashMap;
import java.util.PriorityQueue;
class Solution {
    public int[] rearrangeBarcodes(int[] ba) {

        HashMap<Integer,Integer> kk=new HashMap<>();
        for(int i=0;i<ba.length;i++){
            if(kk.containsKey(ba[i])){
                kk.put(ba[i],kk.get(ba[i])+1);
            }
            else{
                kk.put(ba[i],1);
            }
        }



        PriorityQueue<pair> ll =new PriorityQueue<>(
            (a,b)->{
                if(a.freq!=b.freq){
                    return b.freq-a.freq;
                }
                return a.val-b.val;
            }
        );
  



  for(Map.Entry<Integer,Integer> nn:kk.entrySet()){
    ll.add(new pair(nn.getKey(),nn.getValue()));
  }



  int res[]=new int[ba.length];

  int k=0;

  while(ll.size()>1){
    pair a=ll.poll();
    pair b=ll.poll();

    res[k]=a.val;
    k++;
    res[k]=b.val;
    k++;

    if(a.freq<=1){

    }
    else{
        ll.add(new pair(a.val,a.freq-1));
    }
     if(b.freq<=1){

    }
    else{
        ll.add(new pair(b.val,b.freq-1));
    }
  }

  if(!ll.isEmpty()){
    pair n=ll.poll();
    res[k]=n.val;
    k++;
  }

  return res;


        
    }


}

class pair{
    int val;
    int freq;

    pair(int a,int b){
        val=a;
        freq=b;
    }
}
