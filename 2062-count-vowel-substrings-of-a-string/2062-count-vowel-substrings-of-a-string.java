class Solution {
    public int countVowelSubstrings(String word) {

int c=0;
        for(int i=0;i<word.length();i++){
        
            int a=0;
            int ii=0;
            int o=0;
            int e=0;
            int u=0;
            int oth=0;
            for(int j=i;j<word.length();j++){

                if(word.charAt(j)=='a'){
                    a++;
                }
                else if(word.charAt(j)=='e'){
                    e++;
                }
                else if(word.charAt(j)=='i'){
                    ii++;
                }
                else if(word.charAt(j)=='o'){
                    o++;
                }
                else if(word.charAt(j)=='u'){
                    u++;
                }
                else{
                    oth++;

                }


                if(a>0&&e>0&&ii>0&&o>0&&u>0&&oth==0){
                    c++;
                }

                


            }
        }


        return c;
        
    }
}