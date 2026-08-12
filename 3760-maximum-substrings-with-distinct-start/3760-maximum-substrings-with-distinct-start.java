import java.util.HashSet;
class Solution {
    public int maxDistinct(String s) {
        HashSet<Character> ll=new HashSet<>();
        for(int i=0;i<s.length();i++){
            ll.add(s.charAt(i));
        }

        return ll.size();
        
    }
}