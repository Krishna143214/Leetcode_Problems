import java.util.PriorityQueue;

class Solution {


    static int countpower(int a){
        int c=0;


        while(a!=1){
            if(a%2==0){
                a=a/2;

            }
            else{
                a=3*a+1;
            }
            c++;
        }

        return c;
    }
    public int getKth(int lo, int hi, int k) {


        PriorityQueue<pair> pir=new PriorityQueue<>(
            (a,b)->{
                if(a.power!=b.power){
                    return a.power-b.power;
                }

                return a.value-b.value;
            }
        );



        for(int i=lo;i<=hi;i++){
            pir.add(new pair(i,countpower(i)));
        }


        for(int i=1;i<k;i++){
            pir.remove();
        }


        return pir.peek().value;



        
        
    }
}


class pair{
    int value;
    int power;

    pair(int a,int b){
        value=a;
        power=b;
    }
}