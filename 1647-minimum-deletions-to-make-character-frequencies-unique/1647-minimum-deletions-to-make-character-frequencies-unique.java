import java.util.HashMap;
class Solution {
    public int minDeletions(String s) {
  HashMap<Character,Integer> kk=new HashMap<>();

  for(int i=0;i<s.length();i++){
    if(kk.containsKey(s.charAt(i))){
        kk.put(s.charAt(i),kk.get(s.charAt(i))+1);
    }
    else{
        kk.put(s.charAt(i),1);
    }
  }
int c=0;

  HashSet<Integer> ss=new HashSet<>();

  for(Map.Entry<Character,Integer> nn:kk.entrySet()){

    if(ss.contains(nn.getValue())){

        int k=nn.getValue();
        while(k>0&&ss.contains(k)){
            k--;
            c++;
        }

        if(k>0){
            ss.add(k);
        }

    }

    else{
        ss.add(nn.getValue());
    }
 
  }

  return c;

        
    }
}