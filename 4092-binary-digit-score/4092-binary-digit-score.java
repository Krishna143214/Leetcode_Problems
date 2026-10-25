class Solution {
    public int calculateScore(int a, int b) {

        String m=Integer.toBinaryString(a);
        String n=Integer.toBinaryString(b);


        int s1=0;
        int s2=0;


        for(int i=0;i<m.length();i++){
            if(m.charAt(i)=='1'){
                s1++;
            }
        }

         for(int i=0;i<n.length();i++){
            if(n.charAt(i)=='1'){
                s2++;
            }
        }


        if(s1>=s2){
            return s1*s2;
        }

        return s2/s1;

        
    }
}