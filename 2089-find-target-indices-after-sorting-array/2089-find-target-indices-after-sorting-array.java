class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> ll=new ArrayList<>();

        Arrays.sort(nums);
int i=0;
        for(int a:nums){
            if(a==target){
                ll.add(i);
            }
            i++;

        }

        return ll;
    }
}