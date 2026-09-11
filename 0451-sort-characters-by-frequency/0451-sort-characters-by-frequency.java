import java.util.HashMap;
import java.util.PriorityQueue;

class Solution {
    public String frequencySort(String s) {

        PriorityQueue<pair> kk=new PriorityQueue<>(
            (a,b)->{
                if(a.freq!=b.freq){
                    return b.freq-a.freq;
                }
                return a.val-b.val;
            }
        );


HashMap<Character,Integer> ll=new HashMap<>();

for(int i=0;i<s.length();i++){
    if(ll.containsKey(s.charAt(i))){
        ll.put(s.charAt(i),ll.get(s.charAt(i))+1);

    }
    else{
        ll.put(s.charAt(i),1);
    }
}

for(int i=0;i<s.length();i++){
    kk.add(new pair(s.charAt(i),ll.get(s.charAt(i))));
}


StringBuilder nn=new StringBuilder();


while(!kk.isEmpty()){
    pair ff=kk.poll();
    nn.append(ff.val);
}
  


  return nn.toString();

        
    }
}

class pair{
    char val;
    int freq;

    pair(char a,int b){
        val=a;
        freq=b;
    }
}



