class Solution {
    public int sumCounts(List<Integer> nums) {

        int r[]=new int[nums.size()];
        int o=0;

        for(int a:nums){
            r[o]=a;
            o++;

        }
        int s=0;

        for(int i=0;i<r.length;i++){
            int oo=0;
            HashSet<Integer> kk=new HashSet<>();
            for(int j=i;j<r.length;j++){
kk.add(r[j]);

s=s+kk.size()*kk.size();


            }
        }



        return s;
        
    }
}