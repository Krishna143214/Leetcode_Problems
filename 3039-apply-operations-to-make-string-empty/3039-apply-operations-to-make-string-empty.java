import java.util.HashMap;

class Solution {
    public String lastNonEmptyString(String s) {

        HashMap<Character,Integer> kk = new HashMap<>();
        StringBuilder ss = new StringBuilder();

        for(int i = 0; i < s.length(); i++){
            if(kk.containsKey(s.charAt(i))){
                kk.put(s.charAt(i), kk.get(s.charAt(i)) + 1);
            }
            else{
                kk.put(s.charAt(i), 1);
            }
        }

        int max = 0;

        for(char ch : kk.keySet()){
            if(kk.get(ch) > max){
                max = kk.get(ch);
            }
        }

        for(int i = s.length() - 1; i >= 0; i--){
            char ch = s.charAt(i);

            if(kk.get(ch) == max){
                ss.append(ch);
                kk.put(ch, -1);
            }
        }

        return ss.reverse().toString();
    }
}