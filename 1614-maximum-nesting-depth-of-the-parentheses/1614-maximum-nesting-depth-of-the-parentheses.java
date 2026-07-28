import java.util.Stack;
class Solution {
    public int maxDepth(String s) {
        Stack<Character> kk=new Stack<>();
        int maxs=0;

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==')'||s.charAt(i)=='('){
                if(kk.isEmpty()){
                    kk.push(s.charAt(i));
                    
                }
                else if(kk.peek()=='(' && s.charAt(i)==')'){
                    kk.pop();
                }
                else{
                    kk.push(s.charAt(i));
                }

                if(kk.size()>maxs){
                    maxs=kk.size();
                }
            }
        }

        return maxs;

        
    }
}