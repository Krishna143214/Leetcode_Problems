import java.util.Stack;
class Solution {
    public List<String> printVertically(String s) {

        s=s+" ";
int maxl=0;
      Stack<String> pp=new Stack<>();
      StringBuilder oo=new StringBuilder();


      for(int i=0;i<s.length();i++){
        if(s.charAt(i)==' '){
            maxl=Math.max(maxl,oo.length());
            pp.push(oo.toString());
            oo.setLength(0);
        }

        else{
            oo.append(s.charAt(i));
        }
      }


      Stack<String> jj=new Stack<>();

      while(!pp.isEmpty()){
        jj.push(pp.pop());
      }


      int i=0;

ArrayList<String> res=new ArrayList<>();
      while(i<maxl){
        StringBuilder ss=new StringBuilder();
        Stack<String> bb=new Stack<>();

        while(!jj.isEmpty()){
            if(i>=jj.peek().length()){
                ss.append(" ");
            }
            else{
                ss.append(jj.peek().charAt(i));
            }
            bb.push(jj.pop());
        }

while(ss.charAt(ss.length()-1)==' '){
    ss.deleteCharAt(ss.length()-1);
}

        res.add(ss.toString());


        while(!bb.isEmpty()){
            jj.push(bb.pop());
        }


        i++;
      }

//   ArrayList<String> ll=new ArrayList<>();
//   ll.add(jj.peek());
  return res;


    }
}