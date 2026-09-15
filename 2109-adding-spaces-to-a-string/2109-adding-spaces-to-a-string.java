class Solution {
    public String addSpaces(String s, int[] spaces) {
        int k=0;
        StringBuilder bb=new StringBuilder();


        for(int i=0;i<s.length();i++){
            
            if(k<spaces.length&&spaces[k]==i){
                bb.append(" ");
                k++;
            }
            bb.append(s.charAt(i));


        }

        return bb.toString();
        
    }
}