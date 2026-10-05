import java.util.HashSet;
class Solution {
    public int numberOfSpecialChars(String word) {
HashSet<Character> kk=new HashSet<>();
int c=0;
HashSet<Character> ll=new HashSet<>();

        for(int i=0;i<word.length();i++){

            if(ll.contains(word.charAt(i))){
                continue;
            }
            if(kk.contains((char)(word.charAt(i)+32))){
                ll.add(word.charAt(i));
                c++;
            }

            else if(kk.contains((char)(word.charAt(i)-32))){

                 ll.add(word.charAt(i));
c++;
            }
else{
            kk.add(word.charAt(i));}

        }


        return c;
        
    }
}