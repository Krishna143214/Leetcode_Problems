class Solution {
    public String replaceDigits(String s) {

        StringBuilder kk=new StringBuilder();


        for(int i=0;i<s.length();i++){

            if(s.charAt(i)>='0'&&s.charAt(i)<='9'){
                kk.append((char)(s.charAt(i-1)+s.charAt(i)-'0'));
            }

            else{
                kk.append(s.charAt(i));
            }

        }

        return kk.toString();
        
    }
}