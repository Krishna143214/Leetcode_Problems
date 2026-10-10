class Solution {
    public int sumOddLengthSubarrays(int[] arr) {

        int c=0;


        for(int i=0;i<arr.length;i++){
            int k=0;
            for(int j=i;j<arr.length;j++){
                k=k+arr[j];

                if((j-i)%2==0){
                   c=c+k;
                }
            }
        }


        return c;
        
    }
}