import java.util.HashMap;
class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {

        HashMap<String,String> ll=new HashMap<>();



        for(List<String> mm:knowledge){
            ll.put(mm.get(0),mm.get(1));
        }




        StringBuilder ori=new StringBuilder();
    



        for(int i=0;i<s.length();i++){
  
            if(s.charAt(i)=='('){
                 i++;

                    StringBuilder kk=new StringBuilder();


                    while(s.charAt(i)!=')'){
                     kk.append(s.charAt(i));
                        i++;
                    }

                    if(ll.containsKey(kk.toString())){
                        ori.append(ll.get(kk.toString()));
                    }

                    else{
                        ori.append("?");
                    }
            }

            else{
                ori.append(s.charAt(i));
            }

            

        }



        return ori.toString();

        
    }
}