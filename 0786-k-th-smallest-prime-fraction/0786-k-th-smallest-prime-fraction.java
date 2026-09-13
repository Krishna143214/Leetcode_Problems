import java.util.PriorityQueue;
class Solution {
    public int[] kthSmallestPrimeFraction(int[] arr, int k) {

        PriorityQueue<pair> kk=new PriorityQueue<>(
            (a,b)-> {
                if(a.dif!=b.dif){
                    return Double.compare(a.dif,b.dif);
                }
                return a.fir-b.fir;
            }
        );

        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){

                double dou=(double)arr[i]/(double)arr[j];

                kk.add(new pair(arr[i],arr[j],dou));

            }
        }
for(int i=0;i<k-1;i++){
    kk.poll();
}

pair nn=kk.poll();

return new int[]{nn.fir,nn.sec};


    
        
    }
}
class pair{
    int fir;
    int sec;
    double dif;

    pair(int a,int b,double c){
        fir=a;
        sec=b;
        dif=c;
    }
}

