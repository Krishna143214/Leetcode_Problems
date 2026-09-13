import java.util.HashMap;
import java.util.PriorityQueue;
class Solution {
    public String reorganizeString(String s) {

        HashMap<Character,Integer> ll=new HashMap<>();

        for(int i=0;i<s.length();i++){
            if(ll.containsKey(s.charAt(i))){
                ll.put(s.charAt(i),ll.get(s.charAt(i))+1);
            }
            else{
                ll.put(s.charAt(i),1);
            }
        }

        PriorityQueue<pair> kk=new PriorityQueue<>(
(a,b)->{
    if(a.freq!=b.freq){
        return b.freq-a.freq;
    }

    return a.val-b.val;
}


        );



        for(Map.Entry<Character,Integer> nn:ll.entrySet()){
            kk.add(new pair(nn.getKey(),nn.getValue()));
        }


        StringBuilder sb=new StringBuilder();

        while(kk.size()>1){
            pair a=kk.poll();
            sb.append(a.val);

           
            pair b=kk.poll();
            sb.append(b.val);

             if(a.freq>1){
                kk.add(new pair(a.val,a.freq-1));
            }
            else{

            }
             if(b.freq>1){
                kk.add(new pair(b.val,b.freq-1));
            }
            else{
                
            }
        }


        if(!kk.isEmpty()){
            pair m=kk.poll();
            if(m.freq>1){
                return new String("");
            }
            else{
                sb.append(m.val);
            }
        }

        return sb.toString();


         
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
