import java.util.PriorityQueue;

class Solution {
    public int maximumProduct(int[] nums, int k) {
   PriorityQueue<Integer> kk=new PriorityQueue<>();

   for(int i=0;i<nums.length;i++){
    kk.add(nums[i]);
   }


  for(int i=0;i<k;i++){

int f=(kk.poll()+1);
    kk.add(f);

  }

  long ans=1;

  while(!kk.isEmpty()){
    int p=kk.poll();
    ans=(ans*p)%1000000007;
  }

  return (int)ans;

        
    }
}