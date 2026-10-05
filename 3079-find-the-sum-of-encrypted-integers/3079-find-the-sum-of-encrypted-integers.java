class Solution {

    static int dec(int a){
        String b=Integer.toString(a);


        char lar='1';


        for(int i=0;i<b.length();i++){
            if(b.charAt(i)>lar){
                lar=b.charAt(i);
            }
        }


        StringBuilder rr=new StringBuilder();


        for(int i=0;i<b.length();i++){
            rr.append(lar);


        }

        return Integer.parseInt(rr.toString());
    }
    public int sumOfEncryptedInt(int[] nums) {

        int c=0;


        for(int a:nums){
            c=c+dec(a);
        }

        return c;
        
    }
}