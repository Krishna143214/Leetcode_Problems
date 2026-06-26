import java.util.PriorityQueue;
class Solution {
    public int[] kthSmallestPrimeFraction(int[] arr, int k) {

        PriorityQueue<pair> kk=new PriorityQueue <> (
            (a,b)->{
                return Double.compare(a.ans,b.ans);
            }
        );


        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){

                kk.add(new pair(arr[i],arr[j],(double)arr[i]/arr[j]));

            }
        }


        for(int i=1;i<k;i++){
            kk.poll();

        }

        pair l=kk.poll();
        return new int[]{l.val1,l.val2};
        
    }
}
class pair{
    int val1;
    int val2;
    double ans;

    pair(int a,int b,double c){
     val1=a;
        val2=b;
        ans=c;
    }
}