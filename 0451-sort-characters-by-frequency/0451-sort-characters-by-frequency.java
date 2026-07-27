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





        HashMap<Character,Integer> ss=new HashMap<>();

        for(int i=0;i<s.length();i++){
            if(ss.containsKey(s.charAt(i))){
                ss.put(s.charAt(i),ss.get(s.charAt(i))+1);
            }
            else{
                ss.put(s.charAt(i),1);
            }
        }


        for(Map.Entry<Character,Integer> ll:ss.entrySet()){

            kk.add(new pair(ll.getKey(),ll.getValue()));
        }

        StringBuilder ans=new StringBuilder();

        while(!kk.isEmpty()){
            pair a=kk.poll();
          for(int i=0;i<a.freq;i++){
            ans.append(a.val);
          }

          

        }


        return ans.toString();
  

        
    }
}

class pair{
    char val;
    int freq;

    pair(char c,int b){
        val=c;
        freq=b;
    }
}

