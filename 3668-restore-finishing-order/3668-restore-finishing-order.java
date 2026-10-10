import java.util.HashSet;
class Solution {
    public int[] recoverOrder(int[] o, int[] f) {

        HashSet<Integer> ll=new HashSet<>();


        for(int a:f){
            ll.add(a);
        }


        int res[]=new int[f.length];

        int l=0;


        for(int a:o){
            if(ll.contains(a)){
                res[l]=a;
                l++;

            }
        }

        return res;
        
    }
}