import java.util.HashMap;

import java.util.PriorityQueue;


class Solution {
    public int minSetSize(int[] arr) {

        HashMap<Integer,Integer> jj=new HashMap<>();

        for(int i=0;i<arr.length;i++){
            if(jj.containsKey(arr[i])){
jj.put(arr[i],jj.get(arr[i])+1);
            }

            else{
                jj.put(arr[i],1);
            }
        }


        PriorityQueue<pair> kk=new PriorityQueue<>(
            (a,b)->{
                if(a.freq!=b.freq){
                    return b.freq-a.freq;
                }

                return a.val-b.val;
            }
        );




for(Map.Entry<Integer,Integer> nn:jj.entrySet()){
kk.add(new pair(nn.getKey(),nn.getValue()));
}

int c=arr.length/2;

int k=arr.length;
int res=0;


while(k>c){
    pair a=kk.poll();
    k=k-a.freq;
    res++;

}

return res;

        
    }
}

class pair{
    int val;
    int freq;
    pair(int a,int b){
        val=a;
        freq=b;
    }
}

