import java.util.HashSet;
class Solution {
    public int maxDistinct(String s) {
     HashSet<Character> kk=new HashSet<>();

     for(int i=0;i<s.length();i++){
        kk.add(s.charAt(i));
     }

     return kk.size();
        
    }
}