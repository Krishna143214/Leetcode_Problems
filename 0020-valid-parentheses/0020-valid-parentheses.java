
import java.util.Stack;
class Solution {
    public boolean isValid(String s) {
Stack<Character> kk=new Stack<>();

for(int i=0;i<s.length();i++){
    if(kk.isEmpty()==true){
kk.push(s.charAt(i));
    }
   else if(kk.peek()=='('){
        if(s.charAt(i)==')'){
            kk.pop();
        }
        else{
            kk.push(s.charAt(i));
        }
    }

    else if(kk.peek()=='{'){
        if(s.charAt(i)=='}'){
            kk.pop();
        }

        else{
            kk.push(s.charAt(i));
        }
    }

    else if (kk.peek()=='['){
        if(s.charAt(i)==']'){
            kk.pop();
        }
        else{
             kk.push(s.charAt(i)); 
        }

    }


    else{
         kk.push(s.charAt(i));   
    }
    
}


if(kk.isEmpty()==true){
        return true;
    }

    return false;
}}