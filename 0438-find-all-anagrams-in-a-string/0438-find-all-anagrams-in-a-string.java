import java.util.ArrayList;
import java.util.HashMap;
class Solution {
    public List<Integer> findAnagrams(String s, String p) {
          HashMap<Character,Integer> kk=new HashMap<>();
   for(int o=0;o<p.length();o++){

                

  if(kk.containsKey(p.charAt(o))){
                kk.put(p.charAt(o),kk.get(p.charAt(o))+1);
            }
            else{
                kk.put(p.charAt(o),1);

            }}


        ArrayList<Integer> ll=new ArrayList<>();
      
          HashMap<Character,Integer> jj=new HashMap<>();


        int i=0;
        int j=0;
     

        while(j<s.length()){
          if(jj.containsKey(s.charAt(j))){
            jj.put(s.charAt(j),jj.get(s.charAt(j))+1);
          }
          else{
            jj.put(s.charAt(j),1);
          } 
          
     

            if((j-i)+1<p.length()){
                j++;
            }
            else if((j-i)+1==p.length()){
             int f=0;
             for(Map.Entry<Character,Integer> bb:kk.entrySet()){
               if(!bb.getValue().equals(jj.get(bb.getKey()))){
                f=1;
               }}
               if(f==0){
                ll.add(i);
               }
               
               jj.put(s.charAt(i),jj.get(s.charAt(i))-1);
               if(jj.get(s.charAt(i))==0){
                jj.remove(s.charAt(i));
               }
           

               i++;
               j++;


             }

               

            }
        


        return ll;

        
        
    }
}