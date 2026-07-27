import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.ArrayList;


class Solution {
    public List<String> topKFrequent(String[] word, int k) {
        HashMap<String,Integer> ll=new HashMap<>();

        PriorityQueue<pair> kk=new PriorityQueue<>(
            (a,b)->{
            if(a.freq!=b.freq){
                return b.freq-a.freq;
            }
            return (a.val).compareTo(b.val);    
            }
        );

        for(int i=0;i<word.length;i++){
            if(ll.containsKey(word[i])){
                ll.put(word[i],ll.get(word[i])+1);
            }
            else{
                ll.put(word[i],1);
            }
        }

        for(Map.Entry<String,Integer> nn:ll.entrySet()){

            kk.add(new pair(nn.getKey(),nn.getValue()));

        }

        ArrayList<String> ans=new ArrayList<>();


        for(int i=0;i<k;i++){
            pair o=kk.poll();
            ans.add(o.val);
        }





return ans;





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