import java.util.*;
class Solution {
    public int[] maxKDistinct(int[] nums, int k) {
        HashSet<Integer> kk=new HashSet<>();


        for(int a:nums){
            kk.add(a);

        }

        PriorityQueue<Integer> ll=new PriorityQueue<>(Collections.reverseOrder());
        for(int a:kk){
            ll.add(a);
        }

    int res[]=new int[k];

    int l=0;
    if(k>ll.size()){
        res=new int[ll.size()];
        while(!ll.isEmpty()){
            res[l]=ll.poll();
            l++;
        }

        return res;
    }

        for(int i=0;i<k;i++){

          
            res[i]=ll.poll();
        }


        return res;
        
    }
}