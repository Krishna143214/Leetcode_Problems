
import java.util.Stack;
class Solution {
    public int maximumGain(String s, int x, int y) {


if(x>y){
    int c=0;
    Stack<Character> kk=new Stack<>();

    for(int i=0;i<s.length();i++){
        if(kk.isEmpty()){
            kk.push(s.charAt(i));
        }
        else if(kk.peek()=='a'&&s.charAt(i)=='b'){
            kk.pop();
            c=c+x;

        }
        else{
            kk.push(s.charAt(i));
        }
    }



    StringBuilder sb=new StringBuilder();
    while(!kk.isEmpty()){
        sb.append(kk.pop());
    }


    String b=sb.reverse().toString();

    


      for(int i=0;i<b.length();i++){
        if(kk.isEmpty()){
            kk.push(b.charAt(i));
        }
        else if(kk.peek()=='b'&&b.charAt(i)=='a'){
            kk.pop();
            c=c+y;

        }
        else{
            kk.push(b.charAt(i));
        }
    }

return c;}




int c=0;
    Stack<Character> kk=new Stack<>();

    for(int i=0;i<s.length();i++){
        if(kk.isEmpty()){
            kk.push(s.charAt(i));
        }
        else if(kk.peek()=='b'&&s.charAt(i)=='a'){
            kk.pop();
            c=c+y;

        }
        else{
            kk.push(s.charAt(i));
        }
    }



    StringBuilder sb=new StringBuilder();
    while(!kk.isEmpty()){
        sb.append(kk.pop());
    }


    String b=sb.reverse().toString();

    


      for(int i=0;i<b.length();i++){
        if(kk.isEmpty()){
            kk.push(b.charAt(i));
        }
        else if(kk.peek()=='a'&&b.charAt(i)=='b'){
            kk.pop();
            c=c+x;

        }
        else{
            kk.push(b.charAt(i));
        }
    }

return c;







        
    }
}