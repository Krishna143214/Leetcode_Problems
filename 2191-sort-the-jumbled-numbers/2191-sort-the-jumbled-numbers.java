import java.util.HashMap;
class Solution {
    public int[] sortJumbled(int[] mapping, int[] nums) {
   


   HashMap<Integer,Integer> kk=new HashMap<>();

        for(int i=0;i<mapping.length;i++){
            kk.put(i,mapping[i]);
        }


PriorityQueue<pair> mm=new PriorityQueue<>(
    (a,b)->{
        if(a.aftval!=b.aftval){
            return a.aftval-b.aftval;
        }
        return a.ind-b.ind;
    }
);


for(int i=0;i<nums.length;i++){

    String a=Integer.toString(nums[i]);

    StringBuilder ss=new StringBuilder();

    for(int j=0;j<a.length();j++){

        int b=a.charAt(j)-'0';

        int v=kk.get(b);

          char mj= (char) (v+'0');

        ss.append(mj);

    }


    int res=Integer.parseInt(ss.toString());

    mm.add(new pair(nums[i],res,i));
}



int out[]=new int[nums.length];
int h=0;

while(!mm.isEmpty()){
    pair b=mm.poll();

    out[h]=b.val;
    h++;
}

return out;



        
    }
}

class pair {
    int val;
    int aftval;
    int ind;

    pair(int a, int b,int c){
        val=a;
        aftval=b;
        ind=c;
    }
}