import java.util.Stack;
import java.util.ArrayList;
import java.util.Collections;
class Solution {
    public List<Long> mergeAdjacent(int[] nums) {

List<Long> ll=new ArrayList<>();

Stack<Long> kk=new Stack<>();


for(long a:nums){
    if(kk.isEmpty()){
        kk.push(a);
    }

  
    else{


         long curr=a;

      while(!kk.isEmpty()&&kk.peek()==curr){
        kk.pop();
        curr+=curr;
    
    }

       kk.push((long)curr);

    }
}


Stack<Long> res=new Stack<>();

while(!kk.isEmpty()){
    res.push(kk.pop());
}



while(!res.isEmpty()){
    ll.add(res.pop());

}

return ll;
        
    }
}