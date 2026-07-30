
import java.util.HashMap;
import java.util.PriorityQueue;
class Solution {
    public String largestWordCount(String[] msg, String[] snd) {

        HashMap<String,Integer> ss=new HashMap<>();
        PriorityQueue<pair> ll=new PriorityQueue<>(
            (a,b)->{
                if(a.count!=b.count){
                    return b.count-a.count;
                }
                return b.nam.compareTo(a.nam);
            }
        );

   

for(int i=0;i<snd.length;i++){

    int c=0;
    msg[i]=msg[i]+" ";

    for(int j=0;j<msg[i].length();j++){
        if(msg[i].charAt(j)==' '){
            c++;
        }
    }

    if(ss.containsKey(snd[i])){
        ss.put(snd[i],ss.get(snd[i])+c);
    }

    else{
        ss.put(snd[i],c);
    }
}





for(Map.Entry<String,Integer> nn:ss.entrySet()){
    ll.add(new pair(nn.getKey(),nn.getValue()));
}



pair ans=ll.poll();

return ans.nam;
        
    }
}



class pair{
    String nam;
    int count;

    pair(String a,int b){
        nam=a;
        count=b;
    }
}