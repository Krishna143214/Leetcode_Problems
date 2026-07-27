import java.util.HashMap;
import java.util.PriorityQueue;
class Solution {
    public String reorganizeString(String s) {


        if(s.length()==1){
            return s;
        }
        HashMap<Character,Integer> ll=new HashMap<>();
  for(int i=0;i<s.length();i++){
    if(ll.containsKey(s.charAt(i))){
        ll.put(s.charAt(i),ll.get(s.charAt(i))+1);
    }
    else{
    ll.put(s.charAt(i),1);}
  }

PriorityQueue<pair> kk=new PriorityQueue<>(
(a,b)->{
    if(a.freq!=b.freq){
    return b.freq-a.freq;}
    return a.val-b.val;
}

);
for(Map.Entry<Character,Integer> ss:ll.entrySet()){
  
    
        kk.add(new pair(ss.getKey(),ss.getValue()));
    

}

StringBuilder ans=new StringBuilder();

while(kk.size()>1){
    pair a=kk.poll();
    pair b=kk.poll();

    ans.append(a.val);
    ans.append(b.val);

    int v1=a.freq-1;
    int v2=b.freq-1;

    if(v1>0){
        kk.add(new pair(a.val,v1));
    }
     if(v2>0){
        kk.add(new pair(b.val,v2));
    }
}

if(!kk.isEmpty()){
 pair ff=kk.peek();

 if(ff.freq>1){
    return new String("");
 }

 ans.append(ff.val);}

 return ans.toString();       
    }
}

class pair{
    char val;
    int freq;

    pair(char a,int b){
        val=a;
        freq=b;
    }
}