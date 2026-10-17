import java.util.HashMap;

class Solution {
    public int numberOfSubstrings(String s) {
int i=0;
int j=0;

int c=0;

HashMap<Character,Integer> ll=new HashMap<>();

while(j<s.length()){
    if(ll.containsKey(s.charAt(j))){
        ll.put(s.charAt(j),ll.get(s.charAt(j))+1);
    }

    else{
        ll.put(s.charAt(j),1);
    }



 
        while(ll.size()>=3){
              ll.put(s.charAt(i),ll.get(s.charAt(i)) -1);
              if(ll.get(s.charAt(i))==0){
                ll.remove(s.charAt(i));
              }
              i++;

        }

        c=c+i;
        j++;
    
}


return c;

        
    }
}