import java.util.Stack;

class Solution {
    public boolean validateStackSequences(int[] pus, int[] po) {
Stack<Integer> kk=new Stack<>();

int ii=0;

for(int i=0;i<pus.length;i++){
    kk.push(pus[i]);

    while(!kk.isEmpty()&&ii<po.length&&kk.peek()==po[ii]){
        kk.pop();
        ii++;
    }
}

return kk.isEmpty();

        
    }
}