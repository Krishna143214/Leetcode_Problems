import java.util.PriorityQueue;

class Solution {
    public int[][] kClosest(int[][] poi, int k) {
        PriorityQueue<pair> kk=new PriorityQueue<>(
        (a,b)->{
            return a.out-b.out;
        }
        );



        for(int i=0;i<poi.length;i++){
            kk.add(new pair(poi[i][0],poi[i][1],(poi[i][0]*poi[i][0])+(poi[i][1]*poi[i][1])));
        }

        int ans[][]=new int[k][2];


        for(int i=0;i<k;i++){
           pair n= kk.poll();

           ans[i][0]=n.fir;
           ans[i][1]=n.sec;
        }

        return ans;


    }
}

class pair{
    int fir;
    int sec;
    int out;

    pair(int a,int b,int c){
        fir=a;
        sec=b;
        out=c;    }
}