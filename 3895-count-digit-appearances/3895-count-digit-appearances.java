class Solution {
    public int countDigitOccurrences(int[] nums, int digit) {


        int c=0;


        for(int a:nums){
           String s=Integer.toString(a);

           for(int i=0;i<s.length();i++){
            int m=s.charAt(i)-'0';

            if(m==digit){
                c++;
            }
           }
        }

        return c;
        
    }
}