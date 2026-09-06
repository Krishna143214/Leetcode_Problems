import java.util.HashMap;

class Solution {
    public int lengthOfLongestSubstring(String nums) {

        HashMap<Character,Integer> kk=new HashMap<>();

       int i=0;
       int j=0;
       int len=0;

       while(j<nums.length()){
        if(kk.containsKey(nums.charAt(j))){
            kk.put(nums.charAt(j),kk.get(nums.charAt(j))+1);
        }
        else{
            kk.put(nums.charAt(j),1);

        }

        int l=(j-i)+1;

        if(kk.size()==l){
            len=Math.max(len,l);
            j++;
        }

        else if((j-i+1)>kk.size()){

            while((j-i+1)>kk.size()){
                kk.put(nums.charAt(i),kk.get(nums.charAt(i))-1);
                if(kk.get(nums.charAt(i))==0){
                    kk.remove(nums.charAt(i));
                }

                i++;
            }


              if(kk.size()==j-i+1){
            len=Math.max(len,j-i+1);
            j++;
        }




        }
        
       }




       return len;
    }
}