import java.util.PriorityQueue;

class Solution {
    public int[][] kClosest(int[][] poi, int k) {
        PriorityQueue<pair> ll=new PriorityQueue<>(
            (a,b)->{
                return a.diff-b.diff;

            }
        );

        for(int i=0;i<poi.length;i++){
            ll.add(new pair(poi[i][0],poi[i][1],poi[i][0]*poi[i][0]+poi[i][1]*poi[i][1]));
        }


        int ans[][]=new int[k][2];

        for(int i=0;i<k;i++){
            pair t=ll.poll();
            ans[i][0]=t.fir;
            ans[i][1]=t.sec;
        }

        return ans;



    }
}

class pair{
    int fir;
    int sec;
    int diff;

    pair(int a,int b,int c){
        fir=a;
        sec=b;
        diff=c;
    }
}
