import java.util.Stack;

class Solution {
    public String reverseParentheses(String s) {

Stack<Character> kk=new Stack<>();

for(int i=0;i<s.length();i++){
    if(kk.isEmpty()){
        kk.push(s.charAt(i));
    }

    else if(s.charAt(i)==')'){
      StringBuilder ll=new StringBuilder();
        while(kk.peek()!='('){
            ll.append(kk.pop());
        }
        kk.pop();

        String ss=ll.toString();

        for(int j=0;j<ss.length();j++){
            kk.push(ss.charAt(j));
        }
    }

    else{
        kk.push(s.charAt(i));
    }
}


StringBuilder res=new StringBuilder();

while(!kk.isEmpty()){
    res.append(kk.pop());
}

return res.reverse().toString();

        
    }
}