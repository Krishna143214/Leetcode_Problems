
import java.util.Stack;
class Solution {
    public int minSwaps(String s) {
     Stack<Character> ll=new Stack<>();
     for(int i=0;i<s.length();i++){
        if(ll.isEmpty()){
            ll.push(s.charAt(i));
        }
        else if(ll.peek()=='['&&s.charAt(i)==']'){
            ll.pop();
        }
        else{
            ll.push(s.charAt(i));
        }
     }


    int c=0;
    while(!ll.isEmpty()){
        if(ll.pop()=='['){
            c++;
        }
    }

    return (c+1)/2;
    }
}