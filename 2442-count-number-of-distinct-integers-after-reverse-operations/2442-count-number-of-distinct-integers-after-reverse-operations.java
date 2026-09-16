import java.util.HashSet;

class Solution {
  static int rev(int a){
    int rev=0;

    while(a>0){
        int r=a%10;
        rev=rev*10+r;
        a=a/10;
    }

    return rev;
  }
    public int countDistinctIntegers(int[] nums) {


        HashSet<Integer> kk=new HashSet<>();


        for(int a:nums){
            int b=rev(a);
            kk.add(a);
            kk.add(b);
        }


        return kk.size();

   
 
}}