class Solution {
    public boolean isBalanced(String num) {

        int se=0;
        int so=0;


        for(int i=0;i<num.length();i++){
            if(i%2==0){
                se=se+num.charAt(i)-'0';
            }
            else{
                so=so+num.charAt(i)-'0';
            }
        }


        if(se==so){
            return true;
        }

        return false;
        
    }
}