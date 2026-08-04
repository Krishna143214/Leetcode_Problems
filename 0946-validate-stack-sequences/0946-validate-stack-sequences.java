import java.util.Stack;

class Solution {
    public boolean validateStackSequences(int[] pus, int[] po) {
Stack<Integer> kk=new Stack<>();
int j=0;
for(int i=0;i<pus.length;i++){
   
    kk.push(pus[i]);

     if(kk.peek()==po[j]){
        while(!kk.isEmpty()&&kk.peek()==po[j]){
            kk.pop();
            j++;
        }
    }

   
}

if(kk.isEmpty()){
    return true;
}
return false;

        
    }
}