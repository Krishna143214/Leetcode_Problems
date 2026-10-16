import java.util.HashMap;

class Solution {
    public int lengthOfLongestSubstring(String nums) {

HashMap<Character,Integer> kk=new HashMap<>();


int l=0;
int ml=0;
int i=0;
int j=0;


while(j<nums.length()){
    if(kk.containsKey(nums.charAt(j))){
        kk.put(nums.charAt(j),kk.get(nums.charAt(j))+1);
    }

    else{
        kk.put(nums.charAt(j),1);
    }


    if(kk.size()==j-i+1){
      l=j-i+1;
      ml=Math.max(l,ml);
      j++;

    }

    else if(kk.size()<j-i+1){
        while(kk.size()<j-i+1){
            kk.put(nums.charAt(i),kk.get(nums.charAt(i))-1);
            if(kk.get(nums.charAt(i))==0){
                kk.remove(nums.charAt(i));
            }
            i++;
        }

         if(kk.size()==j-i+1){
      l=j-i+1;
      ml=Math.max(l,ml);
    

    }
j++;

    }







}




return ml;
    }
}