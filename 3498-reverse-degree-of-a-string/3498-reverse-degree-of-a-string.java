import java.util.HashMap;
class Solution {
    public int reverseDegree(String s) {

        HashMap<Character,Integer> kk=new HashMap<>();
        int k=26;

        for(char a='a';a<='z';a++){

            kk.put(a,k);
            k--;

        }


 int c=0;


 for(int i=0;i<s.length();i++){
    int a=kk.get(s.charAt(i));
    a=a*(i+1);
    c=c+a;
 }

 return c;
  
        
    }
}