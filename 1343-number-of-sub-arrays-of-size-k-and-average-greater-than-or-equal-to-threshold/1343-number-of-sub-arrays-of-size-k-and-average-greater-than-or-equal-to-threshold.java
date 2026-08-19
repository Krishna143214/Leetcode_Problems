class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {

        int i=0;
        int j=0;
        int c=0;
        double val=0;

        while(j<arr.length){
            val +=arr[j];

            if((j-i)+1<k){
                j++;
            }
            else if((j-i)+1==k){
                if(val/k>=threshold){
                    c++;
                }

                val -= arr[i];
                i++;
                j++;
            }

        }

        return c;
        
    }
}