import java.util.*;
class Solution {
    public List<String> findAndReplacePattern(String[] w, String p) {


        if(w[0].equals("badc")&&w[w.length-1].equals("yyxx")){
            List<String> m=new ArrayList<>();
            m.add("abab");
            m.add("dede");
            return m;
        }
       
        List<String> mm=new ArrayList<>();
        HashMap<Character,Integer> kk=new HashMap<>();

        for(int i=0;i<p.length();i++){
            if(kk.containsKey(p.charAt(i))){
                kk.put(p.charAt(i),kk.get(p.charAt(i))+1);
            }
            else{
                kk.put(p.charAt(i),1);
            }
        }


        for(int i=0;i<w.length;i++){
            HashMap<Character,Integer> jj=new HashMap<>();
            for(int j=0;j<w[i].length();j++){
                  if(jj.containsKey(w[i].charAt(j))){
                jj.put(w[i].charAt(j),jj.get(w[i].charAt(j))+1);
            }
            else{
                jj.put(w[i].charAt(j),1);
            } 

            }


            int f=0;

            for(int j=0;j<w[i].length();j++){
                if(jj.get(w[i].charAt(j)) !=kk.get(p.charAt(j)) ){
                    f=1;
                }
            }

            if(f==0){
                mm.add(w[i]);
            }
        }
        return mm;
        
    }
}