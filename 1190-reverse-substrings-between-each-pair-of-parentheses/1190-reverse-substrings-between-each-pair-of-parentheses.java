import java.util.Stack;

class Solution {
    public String reverseParentheses(String s) {

Stack<Character> kk=new Stack<>();


for(int i=0;i<s.length();i++){
    if(kk.isEmpty()){
        kk.push(s.charAt(i));
    }

    else if(s.charAt(i)==')'){
        StringBuilder jj=new StringBuilder();
        while(kk.peek()!='('){
            jj.append(kk.pop());
        }
        kk.pop();

        String l=jj.toString();
        for(int ll=0;ll<l.length();ll++){
            kk.push(l.charAt(ll));
        }



    }
    else{
        kk.push(s.charAt(i));
    }
}

StringBuilder out=new StringBuilder();

while(!kk.isEmpty()){
    out.append(kk.pop());
}

return out.reverse().toString();

        
    }
}