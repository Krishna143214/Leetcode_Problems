class Solution {
    public int[] evenOddBit(int n) {

        int co=0;
        int ce=0;

        String s=Integer.toBinaryString(n);

        StringBuilder kk=new StringBuilder(s);

        s=kk.reverse().toString();


        for(int i=0;i<s.length();i++){
            if(i%2==0){
                if(s.charAt(i)=='1'){
                    ce++;
                }
            }

            else{
                if(s.charAt(i)=='1'){
                    co++;
                }
            }
        }



        return new int[]{ce,co};
        
    }
}