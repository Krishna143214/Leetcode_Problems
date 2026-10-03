import java.util.*;
class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {

        List<List<Integer>> ll=new ArrayList<>();
        int diff=Integer.MAX_VALUE;

        Arrays.sort(arr);

      for(int i=0;i<arr.length-1;i++){
       diff=Math.min(diff, Math.abs(arr[i]-arr[i+1]));
      }




        for(int i=0;i<arr.length-1;i++){


            if(Math.abs(arr[i]-arr[i+1])==diff){
                ArrayList<Integer> kk=new ArrayList<>();
                kk.add(arr[i]);
                kk.add(arr[i+1]);

                ll.add(kk);
            }
        }


        return ll;
        
    }
}