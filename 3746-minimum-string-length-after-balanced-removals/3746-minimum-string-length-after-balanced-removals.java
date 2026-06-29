import java.util.Stack;

class Solution {
    public int minLengthAfterRemovals(String s) {
        Stack<Character> kk=new Stack<>();

        for(int i=0;i<s.length();i++){
            if(kk.isEmpty()){
                kk.push(s.charAt(i));
            }

            else if(kk.peek()=='a'&&s.charAt(i)=='b'||kk.peek()=='b'&&s.charAt(i)=='a'){
                kk.pop();
            }
            else{
                kk.push(s.charAt(i));
            }
        }

        return kk.size();

        
        
    }
}