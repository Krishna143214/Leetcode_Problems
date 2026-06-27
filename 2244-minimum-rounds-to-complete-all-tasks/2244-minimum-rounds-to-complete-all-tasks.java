import java.util.HashMap;

class Solution {
    public int minimumRounds(int[] tasks) {

        HashMap<Integer,Integer> kk=new HashMap<>();

        for(int i=0;i<tasks.length;i++){
            if(kk.containsKey(tasks[i])){
                kk.put(tasks[i],kk.get(tasks[i])+1);
            }
            else{
                kk.put(tasks[i],1);
            }
        }
 int count=0;
        for(Map.Entry<Integer,Integer> ll:kk.entrySet()){
                if(ll.getValue()==1){
                        return -1;
                    }

                while(ll.getValue()>0){
                    if(ll.getValue()==2){
                        kk.put(ll.getKey(),ll.getValue()-2);
                        count++;
                    }
                    else{
                        kk.put(ll.getKey(),ll.getValue()-3);
                        count++;
                    }
                  
                
                }

               

            
           
        }



            return count;
        
    }
}