import java.util.HashMap;
class Solution {
    public String findLongestWord(String s, List<String> dictionary) {


String res="";


        for(String a:dictionary){


            
HashMap<Character,Integer> kk=new HashMap<>();
       

            if(a.length()>s.length()){
                continue;
            }

       


    

                int j=0;
              

                for(int m=0;m<s.length();m++){
                    if(s.charAt(m)==a.charAt(j)){
                        j++;
                    }

                    if(j==a.length()){
                        break;
                    }
                }



                if(j==a.length()){

                    if(a.length()>res.length()){
                        res=a;
                    }

                    else if(a.length()==res.length()){

                        if(a.compareTo(res)<0){
                            res=a;
                        }
                    }

                }


            






        }




        return res;

        
    }
}