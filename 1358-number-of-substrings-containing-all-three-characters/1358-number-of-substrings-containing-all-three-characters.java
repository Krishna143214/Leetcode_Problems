import java.util.HashMap;

class Solution {
    public int numberOfSubstrings(String s) {
        int i=0;
        int j=0;


int c=0;

HashMap<Character,Integer> kk=new HashMap<>();

while(j<s.length()){
    if(kk.containsKey(s.charAt(j))){
        kk.put(s.charAt(j),kk.get(s.charAt(j))+1);
    }
    else{
        kk.put(s.charAt(j),1);
    }

 

       

        while(kk.size()==3){
     
       kk.put(s.charAt(i),kk.get(s.charAt(i))-1);
       if(kk.get(s.charAt(i))==0){
        kk.remove(s.charAt(i));
       }

       i++;
        }
        c=c+i;
        j++;
    
   


}



        return c;


        
    }
}