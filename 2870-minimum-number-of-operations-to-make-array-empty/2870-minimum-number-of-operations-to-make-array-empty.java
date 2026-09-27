import java.util.HashMap;
class Solution {
    public int minOperations(int[] nums) {

        HashMap<Integer,Integer> kk=new HashMap<>();


        for(int a:nums){
            if(kk.containsKey(a)){
                kk.put(a,(kk.get(a))+1);
            }
            else{
                kk.put(a,1);
            }
        }

int c=0;
        for(Map.Entry<Integer,Integer> ll:kk.entrySet()){

            if(ll.getValue()<=1){
                return -1;
            }
           while(ll.getValue()>0){
            if(ll.getValue()==2){
                kk.put(ll.getKey(),ll.getValue()-2);
                c++;
            }
            else{
                kk.put(ll.getKey(),ll.getValue()-3);
                c++;
            }
           }

        }

return c;
      
        
    }
}