class Solution {
    public long countSubstrings(String s, char c) {

long co=0;
 for(int i=0;i<s.length();i++){

    if(s.charAt(i)==c){
        co++;
    }
 }

 long res=(co*(co+1))/2;

 return res;
        
    }
}