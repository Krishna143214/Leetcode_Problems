import java.util.HashSet;

class Solution {
    public int passwordStrength(String pa) {

        HashSet<Character> kk=new HashSet<>();


        char a[]=pa.toCharArray();


        for(char b:a){
            kk.add(b);
        }

int count=0;

        for(char k:kk){

            if(k>='a'&&k<='z'){
                count=count+1;
            }

           else if(k>='A'&&k<='Z'){
                count=count+2;
            }
            else if(k>='0'&&k<='9'){
                count=count+3;
            }
            else if(k=='!'||k=='@'||k=='#'||k=='$'){
                count=count+5;
            }
        }


        return count;
   

       

           

          
        
            
        
    }}
        
        
    