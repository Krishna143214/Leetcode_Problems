
import java.util.Stack;
class Solution {
    public int maximumGain(String s, int x, int y) {
if(x>=y){
    int count=0;
    Stack<Character> kk=new Stack<>();
    for(int i=0;i<s.length();i++){
        if(kk.isEmpty()){
            kk.push(s.charAt(i));
        }

        else if(kk.peek()=='a'&&s.charAt(i)=='b'){
            count=count+x;
            kk.pop();
            
        }
        else{
            kk.push(s.charAt(i));
        }
    }

    StringBuilder ll=new StringBuilder();

    while(!kk.isEmpty()){
        ll.append(kk.pop());
    }


    String ans=ll.reverse().toString();

    Stack<Character> gg=new Stack<>();

    for(int i=0;i<ans.length();i++){
        if(gg.isEmpty()){
            gg.push(ans.charAt(i));
        }

        else if(gg.peek()=='b'&&ans.charAt(i)=='a'){
            count=count+y;
            gg.pop();

        }
        else{
            gg.push(ans.charAt(i));

        }
    }

    return count;

}



int val=0;
Stack<Character> jj=new Stack<>();

for(int i=0;i<s.length();i++){
    if(jj.isEmpty()){
        jj.push(s.charAt(i));
    }

    else if(jj.peek()=='b'&& s.charAt(i)=='a'){
        val=val+y;
        jj.pop();

    }

    else{
        jj.push(s.charAt(i));
    }
}

StringBuilder out=new StringBuilder();

while(!jj.isEmpty()){
    out.append(jj.pop());
}

String show=out.reverse().toString();

Stack<Character> st=new Stack<>();

for(int i=0;i<show.length();i++){

    if(st.isEmpty()){
        st.push(show.charAt(i));
    }

    else if(st.peek()=='a'&&show.charAt(i)=='b'){
        val=val+x;
        st.pop();
    }

    else{
        st.push(show.charAt(i));
    }
}


return val;




        
    }
}