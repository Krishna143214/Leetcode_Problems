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

  HashMap<Integer,Integer> ss=new HashMap<>();

  for(Map.Entry<Character,Integer> nn:kk.entrySet()){
    if(ss.containsKey(nn.getValue())){
       int l=nn.getValue();

        while(l>0&&ss.containsKey(l)){
l--;
c++;
        }

        if(l>=0){
                ss.put(l,1);
        }

    }
    else{
        ss.put(nn.getValue(),1);
    }
  }

  return c;

        
    }
}