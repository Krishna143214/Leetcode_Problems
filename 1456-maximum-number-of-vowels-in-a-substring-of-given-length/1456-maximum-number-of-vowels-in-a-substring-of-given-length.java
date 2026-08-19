class Solution {
    public int maxVowels(String s, int k) {
        
        int i=0;
        int j=0;

       
        int max=0;
        int vewel=0;

        while(j<s.length()){

            if(s.charAt(j)=='a'||s.charAt(j)=='e'||s.charAt(j)=='i'||s.charAt(j)=='o'||s.charAt(j)=='u'){
                vewel++;
                
            }

            if((j-i)+1<k){
                j++;
            }
            else if((j-i)+1==k){
                if(vewel>max){
                    max=vewel;
                }
                if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'){
                    vewel--;
                    
                }
                i++;
                j++;

            }

        }



        return max;
    }
}