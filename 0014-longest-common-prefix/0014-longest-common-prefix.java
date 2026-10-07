class Solution {
    public String longestCommonPrefix(String[] strs) {

       
       
        StringBuilder sb = new StringBuilder();

       for(int i=0;i<strs[0].length();i++){

        int f=0;
        for(int j=0;j<strs.length;j++){

            if(i>=strs[j].length()){
                f=1;
                break;
            }
            if(strs[0].charAt(i)!=strs[j].charAt(i)){
                f=1;
                break;
            }

        }
        if(f==0){
            sb.append(strs[0].charAt(i));
        }
        if(f==1){
            break;
        }
       }

        
        return  sb.toString();
    }
}