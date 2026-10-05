class Solution {
    public boolean hasSameDigits(String s) {


        while(s.length()>2){
 StringBuilder kk=new StringBuilder();
for(int i=0;i<s.length()-1;i++){

    kk.append(   Integer.toString((s.charAt(i)-'0'+s.charAt(i+1)-'0')%10)   );
           
        }

        s=kk.toString();
        
    }


    if(s.charAt(0)==s.charAt(1)){
        return true;
    }


    return false;

    }
}