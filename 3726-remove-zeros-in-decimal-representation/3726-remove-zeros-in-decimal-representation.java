class Solution {
    public long removeZeros(long n) {


        String a=Long.toString(n);


        StringBuilder kk=new StringBuilder();

        for(int i=0;i<a.length();i++){
            if(a.charAt(i)=='0'){
                continue;
            }
            kk.append(a.charAt(i));
        }


       return Long.parseLong(kk.toString()); 
        
    }
}