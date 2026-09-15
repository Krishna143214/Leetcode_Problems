
import java.util.HashMap;
class Solution {
    public int minSteps(String s, String t) {

    


HashMap<Character,Integer> kk=new HashMap<>();


for(int i=0;i<s.length();i++){
    if(kk.containsKey(s.charAt(i))){
        kk.put(s.charAt(i),kk.get(s.charAt(i))+1);

    }
    else{
        kk.put(s.charAt(i),1);
    }
}

HashMap<Character,Integer> ll=new HashMap<>();


for(int i=0;i<t.length();i++){
    if(ll.containsKey(t.charAt(i))){
        ll.put(t.charAt(i),ll.get(t.charAt(i))+1);

    }
    else{
        ll.put(t.charAt(i),1);
    }
}


int c=0;

for(int i=0;i<s.length();i++){
    if(ll.containsKey(s.charAt(i))){
        ll.put(s.charAt(i),ll.get(s.charAt(i))-1);
        if(ll.get(s.charAt(i))<=0){
            ll.remove(s.charAt(i));
        }
    }

    else{
        c++;
    }
}



for(int i=0;i<t.length();i++){
    if(kk.containsKey(t.charAt(i))){
        kk.put(t.charAt(i),kk.get(t.charAt(i))-1);
        if(kk.get(t.charAt(i))<=0){
            kk.remove(t.charAt(i));
        }
    }

    else{
        c++;
    }
}

return c;

        
    }
}