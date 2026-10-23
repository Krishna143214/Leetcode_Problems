
import java.util.HashMap;
import java.util.PriorityQueue;
class Solution {
    public int maximumLength(String s) {

HashMap<String,Integer> kk=new HashMap<>();


for(int i=0;i<s.length();i++){
    StringBuilder ll=new StringBuilder();
    HashSet<Character> nn=new HashSet<>();
    for(int j=i;j<s.length();j++){
        nn.add(s.charAt(j));

        if(nn.size()>1){
            break;
        }

        ll.append(s.charAt(j));

        if(kk.containsKey(ll.toString())){
            kk.put(ll.toString(),kk.get(ll.toString())+1);
        }

        else{
            kk.put(ll.toString(),1);
        }

    }
}


PriorityQueue<Integer> mm=new PriorityQueue<>(Collections.reverseOrder());


for(Map.Entry<String,Integer> pp:kk.entrySet()){
    if(pp.getValue()>=3){
        mm.add(pp.getKey().length());
    }
}


if(mm.isEmpty()){
    return -1;
}

return mm.peek();



        
    }
}