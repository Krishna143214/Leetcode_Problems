import java.util.HashMap;
class Solution {
    public int numOfStrings(String[] pat, String word) {

        HashMap<String,Integer> kk=new HashMap<>();
        for(int i=0;i<pat.length;i++){
         if(kk.containsKey(pat[i])){
            kk.put(pat[i],kk.get(pat[i])+1);
         }

         else{
            kk.put(pat[i],1);

         }
        }

int count=0;
        for(int i=0;i<word.length();i++){
            StringBuilder jj=new StringBuilder();
            for(int j=i;j<word.length();j++){
                jj.append(word.charAt(j));

                if(kk.containsKey(jj.toString())){
                    count=count+kk.get(jj.toString());
                    kk.remove(jj.toString());
                }
            }
        }

        return count;
    }
}