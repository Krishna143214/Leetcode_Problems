import java.util.HashMap;
class Solution {
    public boolean checkAlmostEquivalent(String word1, String word2) {
        HashMap<Character,Integer> kk=new HashMap<>();

        for(int i=0;i<word1.length();i++){
            if(kk.containsKey(word1.charAt(i))){
                kk.put(word1.charAt(i),kk.get(word1.charAt(i))+1);
            }
            else{
                kk.put(word1.charAt(i),1);
            }
        }
        

           HashMap<Character,Integer> ll=new HashMap<>();

        for(int i=0;i<word2.length();i++){
            if(ll.containsKey(word2.charAt(i))){
                ll.put(word2.charAt(i),ll.get(word2.charAt(i))+1);
            }
            else{
                ll.put(word2.charAt(i),1);
            }
        }



        for(int i=0;i<word1.length();i++){
            int f1=kk.get(word1.charAt(i));
            int f2=0;
            if(ll.containsKey(word1.charAt(i))){
             f2=ll.get(word1.charAt(i));}

            int diff=Math.abs(f1-f2);
            if(diff>3){
                return false;
            }
        }


  for(int i=0;i<word2.length();i++){
            int f1=ll.get(word2.charAt(i));
            int f2=0;
            if(kk.containsKey(word2.charAt(i))){
             f2=kk.get(word2.charAt(i));}

            int diff=Math.abs(f1-f2);
            if(diff>3){
                return false;
            }
        }

        return true;
    }
}