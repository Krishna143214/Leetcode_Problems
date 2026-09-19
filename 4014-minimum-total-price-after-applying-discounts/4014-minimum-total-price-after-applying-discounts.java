import java.util.PriorityQueue;
import java.util.Collections;
class Solution {
    public double minPrice(int[] prices, int[] discounts) {



        double res=0;


        PriorityQueue<Double> kk=new PriorityQueue<>(Collections.reverseOrder());

        for(int a:prices){
            kk.add((double)a);
        }
         PriorityQueue<Double> ll=new PriorityQueue<>(Collections.reverseOrder());

           for(int a:discounts){
            ll.add((double)a);
        }


        while(!kk.isEmpty()){

            if(!ll.isEmpty()){
                double a=kk.poll();
                double b=ll.poll();
                res=res+((a*(100-b))/100);
            }

            else{
                res=res+kk.poll();
            }
        
        
        }


        return res;
     


  
            
        
    }
}