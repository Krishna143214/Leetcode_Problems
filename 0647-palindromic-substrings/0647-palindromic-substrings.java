class Solution {
    public int countSubstrings(String s) {
int c=0;
        for(int i=0;i<s.length();i++){
            StringBuilder aa=new StringBuilder();
            for(int j=i;j<s.length();j++){
                aa.append(s.charAt(j));

                    String k=aa.toString();
                
                StringBuilder mm=new StringBuilder(k);
                
              

                if(aa.toString().equals(mm.reverse().toString())){
                    c++;
                }

            }
        }

        return c;
        
    }
}