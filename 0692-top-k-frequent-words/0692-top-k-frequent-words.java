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
            (a,b) -> {
                if(a.freq!=b.freq){
                    return b.freq-a.freq;
                }

                return a.word.compareTo(b.word);
            }
        );


        for(Map.Entry<String,Integer> nn :kk.entrySet()){
            ll.add(new pair(nn.getKey(),nn.getValue()));
        }


        ArrayList<String> bb=new ArrayList<>();


        for(int i=0;i<k;i++){
            pair g=ll.poll();

            bb.add(g.word);
        }


        return bb;








    }
}

class pair{
    String word;
    int freq;
 


    pair(String ak,int bk){
        word=ak;
        freq=bk;
    
    }
}