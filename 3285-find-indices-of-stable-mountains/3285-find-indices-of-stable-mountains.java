class Solution {
    public List<Integer> stableMountains(int[] height, int threshold) {
        List<Integer> ll=new ArrayList<>();

        for(int i=1;i<height.length;i++){
            if(height[i-1]>threshold){

                ll.add(i);
            }
        }


        return ll;
    }
}