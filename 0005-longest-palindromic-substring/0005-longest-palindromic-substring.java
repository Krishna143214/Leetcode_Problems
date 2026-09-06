class Solution {
    public String longestPalindrome(String s) {
int l=0;
String o="";


for(int i=0;i<s.length();i++){
    StringBuilder kk=new StringBuilder();
    for(int j=i;j<s.length();j++){

        kk.append(s.charAt(j));

        String b=kk.toString();

        int ii=0;
        int jj=b.length()-1;
        int f=0;


        while(ii<jj){
            if(b.charAt(ii)!=b.charAt(jj)){
                f=1;
                break;
            }
            ii++;
            jj--;
        }

        if(f==0){
            if(b.length()>l){
                l=b.length();
                o=b;
            }
        }


    }
}


return o;



        
    }
}