import java.util.HashMap;
import java.util.PriorityQueue;

class Solution {
    public int minDeletion(String s, int k) {

        HashMap<Character,Integer> kk=new HashMap<>();
        PriorityQueue<Integer> vv=new PriorityQueue<>();

        for(int i=0;i<s.length();i++){
            if(kk.containsKey(s.charAt(i))){
                kk.put(s.charAt(i),kk.get(s.charAt(i))+1);
            }
            else{
            kk.put(s.charAt(i),1);}
        }

        int count=0;

        for(Map.Entry<Character,Integer> ll:kk.entrySet()){
            vv.add(ll.getValue());
         
        }

        if(vv.size()<=k){
            return 0;
        }
        

        while(vv.size()>k){
            count=count+vv.poll();
        }
        return count;

   
        
    }
}