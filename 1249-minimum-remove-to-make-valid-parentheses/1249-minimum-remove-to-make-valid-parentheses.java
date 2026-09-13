import java.util.Stack;
import java.util.HashSet;
class Solution {
    public String minRemoveToMakeValid(String s) {

        Stack<pair> kk=new Stack<>();

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('||s.charAt(i)==')'){
                if(kk.isEmpty()){
                    kk.push(new pair(s.charAt(i),i));
                }
                else if(kk.peek().val=='('&&s.charAt(i)==')'){
                    kk.pop();
                }
                else{

                           kk.push(new pair(s.charAt(i),i));
                }
            }
        }

        char a[]=s.toCharArray();

        while(!kk.isEmpty()){
            pair n=kk.pop();
            a[n.ind]='*';
        }

        StringBuilder res=new StringBuilder();

        for(int i=0;i<a.length;i++){
            if(a[i]=='*'){
                continue;
            }
            else{
                res.append(a[i]);
            }
        }


        return res.toString();




        
    }
}
class pair{
    char val;
    int ind;

    pair(char a, int b){
        val=a;
        ind=b;
    }
}



