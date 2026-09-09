import java.util.Stack;
class Solution {
    public int evalRPN(String[] t) {
Stack<Integer> kk=new Stack<>();

for(int i=0;i<t.length;i++){
    if(t[i].equals("+")){
        int a=kk.pop();
        int b=kk.pop();
        kk.push(a+b);
    }
    else if(t[i].equals("-")){
        int a=kk.pop();
        int b=kk.pop();
        kk.push(b-a);
    }
     else if(t[i].equals("*")){
        int a=kk.pop();
        int b=kk.pop();
        kk.push(b*a);
    }

     else if(t[i].equals("/")){
        int a=kk.pop();
        int b=kk.pop();
        kk.push(b/a);
    }

    else{
        kk.push(Integer.parseInt(t[i]));
    }
}



return kk.peek();
        
    }
}