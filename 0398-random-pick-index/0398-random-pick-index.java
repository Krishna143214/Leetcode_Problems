class Solution {
    int arr[];

    public Solution(int[] nums) {

        arr=new int[nums.length];
        int i=0;

        for(int a:nums){
            arr[i]=a;
            i++;

        }
        
    }
    
    public int pick(int target) {
        ArrayList<Integer> ll=new ArrayList<>();

        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
               ll.add(i);
            }
        }

      

        Random pp=new Random();
      int g=  pp.nextInt(ll.size());
      return ll.get(g);



        
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int param_1 = obj.pick(target);
 */