import java.util.HashMap;
import java.util.HashSet;
import java.util.Collections;
import java.util.ArrayList;
class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {

        HashMap<Integer,Integer> kk=new HashMap<>();

        for(int i=0;i<matches.length;i++){
             if(kk.containsKey(matches[i][0])){
                kk.put(matches[i][0],kk.get(matches[i][0])+1);
            }

            else{
                kk.put(matches[i][0],1);
            }
         
        }

        HashMap<Integer,Integer> ll=new HashMap<>();

        for(int i=0;i<matches.length;i++){
            if(ll.containsKey(matches[i][1])){
                ll.put(matches[i][1],ll.get(matches[i][1])+1);
            }

            else{
                ll.put(matches[i][1],1);
            }
        }



        ArrayList<Integer> res=new ArrayList<>();

       for(Map.Entry<Integer,Integer> nn:kk.entrySet()){
        if(!ll.containsKey(nn.getKey())){
            res.add(nn.getKey());
        }


       }

        ArrayList<Integer> res2=new ArrayList<>();

        for(Map.Entry<Integer,Integer> mm:ll.entrySet()){
            if(mm.getValue()==1){
res2.add(mm.getKey());
            }
        }


     Collections.sort(res);
        Collections.sort(res2);


        List<List<Integer>> out=new ArrayList<>();
out.add(res);
out.add(res2);


return out;


        
    }


}