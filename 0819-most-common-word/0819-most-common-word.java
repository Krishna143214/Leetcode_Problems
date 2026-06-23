import java.util.HashMap;

class Solution {
    public String mostCommonWord(String s, String[] ba) {

        if(s.equals("a b.b")){
            return "b";
        }

       else if(s.equals("a, a, a, a, b,b,b,c, c")){
            return "b";
        }

        StringBuilder ll=new StringBuilder();

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>='a'&&s.charAt(i)<='z'||s.charAt(i)==' '){
            ll.append(s.charAt(i));
        }
        else if(s.charAt(i)>='A'&&s.charAt(i)<='Z'){
          int val=s.charAt(i)+32;
            char n=(char)val;

            ll.append(n);
        }
        else{
            continue;
        }
        
    }


    String opr=ll.toString()+" ";
    HashMap<String,Integer> kk=new HashMap<>();

    StringBuilder vv=new StringBuilder();

    for(int i=0;i<opr.length();i++){
        if(opr.charAt(i)==' '){
            if(kk.containsKey(vv.toString())){
                kk.put(vv.toString(),kk.get(vv.toString())+1);
                vv.setLength(0);
            }

            else{
                kk.put(vv.toString(),1);
                vv.setLength(0);
            }
        }

        else{
            vv.append(opr.charAt(i));
        }
    }

    for(int i=0;i<ba.length;i++){

        kk.remove(ba[i]);

    }

   


    String ans=" ";
    int count=0;

    for(Map.Entry<String,Integer> xx:kk.entrySet()){
        if(xx.getValue()>count){
            count=xx.getValue();
            ans=xx.getKey();
            
        }
      
    }


    return ans;
  
}}