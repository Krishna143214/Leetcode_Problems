class Solution {
    public boolean lemonadeChange(int[] bills) {

        int cf=0;
        int ct=0;
        int ctw=0;


        for(int a:bills){
            if(a==5){
                cf++;
            }
            else if(a==10){

                if(cf>=1){
                cf--;
                ct++;}
                else{
                    return false;
                }
            }

            else{
            if(ct>=1&&cf>=1){
                ct--;
                cf--;
            }

            else if(cf>=3){
                cf--;
                cf--;
                cf--;
            }


            else{
                return false;
            }
            }
        }



        return true;
        
    }
}