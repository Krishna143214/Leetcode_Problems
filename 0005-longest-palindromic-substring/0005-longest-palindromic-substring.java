class Solution {
    public String longestPalindrome(String s) {
StringBuilder aa=new StringBuilder();
      
        int max=0;
   String nn="";


        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                aa.append(s.charAt(j));

                String a=aa.toString();
                 int m=0;
                 int n=a.length()-1;
                 int f=0;

                 while(m<n){
                    if(a.charAt(m)!=a.charAt(n)){
                        f=1;
                        break;

                    }
                    m++;
                    n--;
                 }
           
             
                    if(f==0 && a.length()>max){
                        max=a.length();
                         nn=a;

                    

                }

                

            }
            aa.setLength(0);


        }


        return nn;



        
    }
}