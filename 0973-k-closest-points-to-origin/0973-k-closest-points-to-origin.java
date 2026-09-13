import java.util.PriorityQueue;

class Solution {
    public int[][] kClosest(int[][] poi, int k) {

        PriorityQueue<pair> kk=new PriorityQueue<>(
            (a,b)->{
                       if(a.dif!=b.dif){
                        return a.dif-b.dif;
                       }

                       return a.fir-b.fir;
            }
        );
        
        for(int i=0;i<poi.length;i++){
            kk.add(new pair(poi[i][0],poi[i][1],poi[i][0]*poi[i][0]+poi[i][1]*poi[i][1]));
        }


int res[][]=new int[k][2];
        for(int i=0;i<k;i++){
            pair f=kk.poll();
res[i][0]=f.fir;
res[i][1]=f.sec;

        }
return res;



    }
}

class pair{
int fir;
int sec;
int dif;

pair(int a,int b,int c){
    fir=a;
    sec=b;
    dif=c;
}
}
