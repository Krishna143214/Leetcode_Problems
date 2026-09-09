import java.util.Stack;

class Solution {
    public String reverseWords(String s) {
        Stack<String> kk=new Stack<>();
        s=s+" ";

StringBuilder jk=new StringBuilder();

for(int i=0;i<s.length();i++){
    if(s.charAt(i)==' '){
        if(jk.length()>0){
            kk.push(jk.toString());
            jk.setLength(0);
        }
    }

    else{
        jk.append(s.charAt(i));
    }
}


if(kk.isEmpty()){
    return new String(" ");
}
while(!kk.isEmpty()){
    jk.append(kk.pop());
    jk.append(' ');
}

jk.deleteCharAt(jk.length()-1);

return jk.toString();

        }
    }
