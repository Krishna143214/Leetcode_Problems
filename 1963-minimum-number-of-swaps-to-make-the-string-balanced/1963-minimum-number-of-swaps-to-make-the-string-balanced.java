
import java.util.Stack;
class Solution {
    public int minSwaps(String s) {
        Stack<Character> kk =new Stack<>();

        for(int i=0;i<s.length();i++){
            if(kk.isEmpty()){
                kk.push(s.charAt(i));
            }
            else if(kk.peek()=='['&&s.charAt(i)==']'){
                kk.pop();

            }
            else{
                kk.push(s.charAt(i));
            }
        }


        int res=((kk.size()/2)+1)/2;
        return res;
        
    }
}