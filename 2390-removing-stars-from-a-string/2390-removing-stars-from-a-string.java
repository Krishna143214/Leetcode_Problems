import java.lang.StringBuilder;

class Solution {
    public String removeStars(String s) {
        StringBuilder kk=new StringBuilder();

    for(int i=0;i<s.length();i++){
        if(s.charAt(i)=='*'){
            if(kk.length()>0){
                kk.deleteCharAt(kk.length()-1);
            }
        }

        else{
            kk.append(s.charAt(i));
        }
    }

    return kk.toString();
        
    }
}