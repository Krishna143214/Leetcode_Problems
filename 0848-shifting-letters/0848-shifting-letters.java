class Solution {
    public String shiftingLetters(String s, int[] shifts) {

        long res[]=new long[shifts.length];

        res[shifts.length-1]=shifts[shifts.length-1];
        for(int i=shifts.length-2;i>=0;i--){
            res[i]=shifts[i]+res[i+1];
        }


        StringBuilder kk=new StringBuilder();

        for(int i=0;i<s.length();i++){
            int b=s.charAt(i)-97;
            int c=(int)((b+res[i])%26)+97;
            char r=(char)c;
            kk.append(r);

        }

        return kk.toString();
        
    }
}