import java.util.PriorityQueue;
class Solution {
    public int[] kthSmallestPrimeFraction(int[] arr, int k) {
        PriorityQueue<pair> kk=new PriorityQueue<>(
        (a,b)->{
            return Double.compare(a.val,b.val);
        }
        );

        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                kk.add(new pair(arr[i],arr[j],(double)arr[i]/arr[j]));
            }
        }

        for(int i=1;i<k;i++){
            pair l=kk.poll();

        }

        return new int[]{kk.peek().ii,kk.peek().jj};


    
        
    }
}
class pair{
    int ii;
    int jj;
    double val;

    pair(int a,int b,double c){
        ii=a;
        jj=b;
        val=c;
    }
}