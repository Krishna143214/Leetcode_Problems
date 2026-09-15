import java.util.PriorityQueue;

class Solution {
    public int maximumProduct(int[] nums, int k) {
PriorityQueue<Integer> kk=new PriorityQueue<>();

for(int i=0;i<nums.length;i++){
    kk.add(nums[i]);
}


for(int i=0;i<k;i++){
    int a=kk.poll();
    kk.add(a+1);
}


long res=1;

while(!kk.isEmpty()){

    res=(res*kk.poll())%1000000007;
}

return (int)res;

        
    }
}