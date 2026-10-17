class Solution {
    public int maxVowels(String s, int k) {
        int c=0;
        int mc=0;

        for(int i=0;i<k;i++){
            if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'){
                c++;
            }

        }

        mc=Math.max(c,mc);

        int i=0;
        int j=k;


        while(j<s.length()){
             if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'){
                c--;
            }
            i++;
        if(s.charAt(j)=='a'||s.charAt(j)=='e'||s.charAt(j)=='i'||s.charAt(j)=='o'||s.charAt(j)=='u'){
                c++;
            }

            j++;

  mc=Math.max(c,mc);

            
        }

        return mc;
 
    }
}