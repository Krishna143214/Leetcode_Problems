import java.util.HashMap;


class Solution {
    public int totalFruit(int[] fruits) {


        int i=0;
        int c=0;
        int maxc=0;
        int j=0;

        HashMap<Integer,Integer> kk=new HashMap<>();


        while(j<fruits.length){

            if(kk.containsKey(fruits[j])){
                kk.put(fruits[j],kk.get(fruits[j])+1);
            }
            else{
               kk.put(fruits[j],1); 
            }
            c=j-i+1;

            if(kk.size()<2){ 
                  maxc=Math.max(maxc,c);

                j++;
            }

         
            else{
                while(kk.size()>2){
                   kk.put(fruits[i],kk.get(fruits[i])-1);

                   if(kk.get(fruits[i])==0){
                    kk.remove(fruits[i]);
                   }

                 
                   i++;}

 if(kk.size()==2){
                maxc=Math.max(maxc,j-i+1);
       


                }

                j++;
            }
        }


        return maxc;
    
        
    }
}