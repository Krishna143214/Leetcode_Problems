import java.util.PriorityQueue;
class Solution {
    public int[] getStrongest(int[] arr, int k) {
        Arrays.sort(arr);

        int m=arr[(arr.length-1)/2];


       PriorityQueue<pair> ll=new PriorityQueue<>(
        (a,b)->{
            if(a.power!=b.power){
                return b.power-a.power;
            }

            return b.val-a.val;
        }
       );

       for(int a:arr){
      ll.add(new pair(a,Math.abs(a-m)));
       }


       int res[]=new int[k];

       for(int i=0;i<k;i++){
        res[i]=ll.poll().val;

       }


       return res;

    }
}

class pair{
    int val;
    int power;

    pair(int a,int b){
        val=a;
        power=b;
    }
}