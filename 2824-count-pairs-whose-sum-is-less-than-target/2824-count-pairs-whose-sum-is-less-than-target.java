
class Solution {
    public int countPairs(List<Integer> nums, int target) {

        int arr[]=new int[nums.size()];
int o=0;
        for(int a:nums){
            arr[o]=a;
            o++;

        }

    int c=0;

        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){

                if(arr[i]+arr[j]<target){
                    c++;
                }

            }
        }

        return c;



        
    }
}