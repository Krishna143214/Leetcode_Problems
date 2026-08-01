import java.util.HashMap;
import java.util.Arrays;
class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        HashMap<Integer,Integer> kk=new HashMap<>();

           if(hand.length % groupSize != 0){
            return false;
        }

        for(int i=0;i<hand.length;i++){
            if(kk.containsKey(hand[i])){
                kk.put(hand[i],kk.get(hand[i])+1);

            }
            else{
                kk.put(hand[i],1);
            }
        }

        Arrays.sort(hand);
        int c=0;

        for(int i=0;i<hand.length;i++){


             if(!kk.containsKey(hand[i])){
                continue;
            }

            int start = hand[i];
            int f=0;
            for(int j=0;j<groupSize;j++){
                if(kk.containsKey(start+j)){
kk.put(start+j,kk.get(start+j)-1);
if(kk.get(start+j)<=0){
    kk.remove(start+j);
}
                }
                else{
                    return false;
                }


            }}


        return true;        
    }
}