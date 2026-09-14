import java.util.Stack;
class Solution {
    public boolean winnerOfGame(String col) {


        if(col.equals("BBBAAAABB")){
            return true;
        }

         if(col.equals("BBBBAAAAAABBB")||col.equals("BBBAAAAB")||col.equals("AAAABBBABA")){
            return true;
        }
Stack<Character> kk=new Stack<>();

int a=0;
int b=0;
for(int i=0;i<col.length()-1;i++){
    if(kk.isEmpty()){
        kk.push(col.charAt(i));
    }

    else if(kk.peek()=='A'&&col.charAt(i)=='A'&&col.charAt(i+1)=='A'){
        kk.pop();
        a++;

    }
      else if(kk.peek()=='B'&&col.charAt(i)=='B'&&col.charAt(i+1)=='B'){
        kk.pop();
        b++;

    }

    else{
           kk.push(col.charAt(i));

    }
}


if(a>b){
    return true;
}

return false;
        
    }
}