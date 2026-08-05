import java.util.Stack;
import java.util.ArrayList;
import java.util.Collections;
class Solution {
    public List<Long> mergeAdjacent(int[] nums) {

        Stack<Long> kk=new Stack<>();
        ArrayList<Long> k=new ArrayList<>();

 for (int i = 0; i < nums.length; i++) {
    if (kk.isEmpty()) {
        kk.push((long) nums[i]);
    } else {
        long curr = nums[i];

        while (!kk.isEmpty() && kk.peek() == curr) {
            kk.pop();
            curr += curr;
        }

        kk.push(curr);
    }
}

        while(!kk.isEmpty()){
            k.add(kk.pop());
        }

        Collections.reverse(k);
        return k;








        
    }
}