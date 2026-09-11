import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.ArrayList;


class Solution {
    public List<String> topKFrequent(String[] word, int k) {

        HashMap<String,Integer> kk=new HashMap<>();


        for(int i=0;i<word.length;i++){
            if(kk.containsKey(word[i])){
                kk.put(word[i],kk.get(word[i])+1);
            }
            else{
                kk.put(word[i],1);
            }
        }


        PriorityQueue<pair> ll=new PriorityQueue<>(
            (a,b)->{
                if(a.freq!=b.freq){
                    return b.freq-a.freq;
                }

                return a.val.compareTo(b.val);

            }
        );

        for(Map.Entry<String,Integer> mm:kk.entrySet()){
            ll.add(new pair(mm.getKey(),mm.getValue()));
        }



ArrayList<String> res=new ArrayList<>();


for(int i=0;i<k;i++){
pair n=ll.poll();

res.add(n.val);

}

return res;


    }
}

class pair{
    String val;
    int freq;
    pair(String a,int b){
        val=a;
        freq=b;
    }
}