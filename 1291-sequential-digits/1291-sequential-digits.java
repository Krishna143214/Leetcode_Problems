import java.util.ArrayList;
import java.util.Collections;
class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
ArrayList<Integer> kk=new ArrayList<>();
     kk.add(123456789);
     kk.add(12);
     kk.add(123);
     kk.add(1234);
     kk.add(12345);
     kk.add(123456);
     kk.add(1234567);
     kk.add(12345678);
     kk.add(23456789);
     kk.add(23);
     kk.add(234);
     kk.add(2345);
     kk.add(23456);
     kk.add(234567);
     kk.add(2345678);
     kk.add(34);
     kk.add(345);
     kk.add(3456);
     kk.add(34567);
     kk.add(345678);
     kk.add(3456789);
    
     kk.add(45);
     kk.add(456);
     kk.add(4567);
     kk.add(45678);
     kk.add(456789);

  
     kk.add(56);
     kk.add(567);
     kk.add(5678);
     kk.add(56789);
    
     kk.add(67);
     kk.add(678);
     kk.add(6789);

      kk.add(78);
     kk.add(789);

   
     kk.add(89);


Collections.sort(kk);

ArrayList<Integer> res=new ArrayList<>();

     for(int a:kk){
        if(a>=low &&a<=high){
           res.add(a);
        }
     }

     return res;
     
        
    }
}