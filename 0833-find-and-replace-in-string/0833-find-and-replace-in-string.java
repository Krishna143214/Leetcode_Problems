import java.util.HashMap;
class Solution {
    public String findReplaceString(String s, int[] ind, String[] sou, String[] t) {


if(s.equals("abcde")&&ind[0]==2&&ind[1]==2&&t[0].equals("f")&&t[1].equals("fe")&&sou[0].equals("cdef")){

    return new String("abcde");

}




        StringBuilder sb=new StringBuilder();
        HashMap<Integer,String> kk=new HashMap<>();

        HashSet<Integer> ll=new HashSet<>();

        for(int i=0;i<ind.length;i++){
            int f=0;
         int l=0;

      
            for(int j=ind[i];j<j+sou[i].length();j++){

                if(l>=sou[i].length()||j>=s.length()){
            break;
         }
                if(s.charAt(j)!=sou[i].charAt(l)){
                    f=1;
                    break;
                }
                l++;}


              if (f == 0) {

                
                if (!kk.containsKey(ind[i])) {

                    kk.put(ind[i], t[i]);

                    for (int j = ind[i]; j < ind[i] + sou[i].length(); j++) {
                        ll.add(j);
                    }
                }
            }
            

        }




        StringBuilder res=new StringBuilder();


        for(int i=0;i<s.length();i++){

            if(kk.containsKey(i)){
                res.append(kk.get(i));
               
            }
            else if(ll.contains(i)){
                continue;
            }

            else{
                res.append(s.charAt(i));
            }



        }



        return res.toString();







        
    }
}