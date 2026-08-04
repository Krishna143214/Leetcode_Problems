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

HashSet<Integer> d=new HashSet<>();
StringBuilder oo=new StringBuilder();

while(!kk.isEmpty()){
    d.add(kk.peek().ind);
    kk.pop();

}

for(int k=0;k<s.length();k++){
    if(d.contains(k)){
        continue;
    }
    else{
        oo.append(s.charAt(k));
    }
}



return oo.toString();


        
    }
}

class pair{
    char val;
    int ind;

    pair(char a,int b){
        val=a;
        ind=b;
    }
}
