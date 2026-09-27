import java.util.Stack;
class Solution {
    public String resultingString(String s) {

Stack<Character> kk=new Stack<>();



for(int i=0;i<s.length();i++){
    if(kk.isEmpty()){
        kk.push(s.charAt(i));
    }
    else if((char)((((kk.peek()-97)+1)%26)+97)==s.charAt(i)){
        kk.pop();

    }
    else if((char)((((s.charAt(i)-97)+1)%26)+97)==kk.peek()){
        kk.pop();

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