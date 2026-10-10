import java.util.*;
class Solution {
    public String findCommonResponse(List<List<String>> responses) {

HashMap<String,Integer> kk=new HashMap<>();

for(List<String> m:responses){
    HashSet<String> ll=new HashSet<>();

    for(String p:m){
        ll.add(p);
    }

    for(String g:ll){

        if(kk.containsKey(g)){
            kk.put(g,kk.get(g)+1);
        }
        else{
            kk.put(g,1);
        }
    }
}


PriorityQueue<pair> mm=new PriorityQueue<>(
    (a,b)->{
        if(a.freq!=b.freq){
            return b.freq-a.freq;
        }

        return a.val.compareTo(b.val);
    }
);



for(Map.Entry<String,Integer> bb:kk.entrySet()){

    mm.add(new pair(bb.getKey(),bb.getValue()));
}


return mm.peek().val;

        
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