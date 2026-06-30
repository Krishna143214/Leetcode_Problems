import java.util.Stack;

class Solution {
    public String reverseWords(String s) {
        Stack<String> kk=new Stack<>();

        s=s+" ";
        
StringBuilder ll=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' '){
                if(ll.length()>0){
                kk.push(ll.toString());
                ll.setLength(0);}
            }
            else{
                ll.append(s.charAt(i));
            }
        }


        while(!kk.isEmpty()){
            ll.append(kk.pop());
            ll.append(' ');
        }

        ll.deleteCharAt(ll.length()-1);
        return ll.toString();


        }
    }
