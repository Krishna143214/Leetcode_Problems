import java.util.HashMap;


class Solution {
    public int totalFruit(int[] fruits) {
        HashMap<Integer,Integer> kk=new HashMap<>();
   int j=0;
   int i=0;
   int res=0;
   int c=0;

   while(j<fruits.length){

    if(kk.containsKey(fruits[j])){
           kk.put(fruits[j],kk.get(fruits[j])+1);

    }
    else{
        kk.put(fruits[j],1);
    }
 
    c++;
    
    if(kk.size()<2){
        j++;

    }
    else if(kk.size()>=2){

        while(kk.size()>2){
            kk.put(fruits[i],kk.get(fruits[i])-1);
            if(kk.get(fruits[i])<=0){
                kk.remove(fruits[i]);
            }
            i++;
            c--;
        }

        res=Math.max(c,res);
        j++;

    }
     res=Math.max(c,res);

   }


   return res;
        
    }
}