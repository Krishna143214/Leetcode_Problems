import java.util.Stack;
class Solution {
    public String minRemoveToMakeValid(String s) {
        Stack<pair> kk=new Stack<>();
        StringBuilder ll=new StringBuilder(s);

        for(int i=0;i<s.length();i++){
          if(s.charAt(i)=='('||s.charAt(i)==')'){
            if(kk.isEmpty()){
                kk.push(new pair(s.charAt(i),i));
            }
            else if(kk.peek().val=='('&& s.charAt(i)==')'){
                kk.pop();
            }
            else{
                kk.push(new pair(s.charAt(i),i));
            }
          }
        }


while(!kk.isEmpty()){
    pair b=kk.pop();

    ll.deleteCharAt(b.indi);

}

return ll.toString();







        
    }
}
class pair{
    char val;
    int indi;

    pair(char a,int b){
        val=a;
        indi=b;
    }
}