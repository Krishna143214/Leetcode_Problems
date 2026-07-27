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


        PriorityQueue<pair> ll=new PriorityQueue<>(
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

int ans[]=new int[ba.length];
int h=0;

        while(ll.size()>1){
            pair a=ll.poll();
            ans[h]=a.val;
            h++;
            pair b=ll.poll();
            ans[h]=b.val;
            h++;
            int v=a.freq-1;
            int x=b.freq-1;


            if(v>0){
                ll.add(new pair(a.val,v));
            }
            if(x>0){
                ll.add(new pair(b.val,x));
            }
        }

        if(!ll.isEmpty()){

            pair j=ll.poll();

            if(j.freq>1){
                return new int[]{-1,-1};
            }
            ans[h]=j.val;
            h++;


        }

        return ans;


        
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