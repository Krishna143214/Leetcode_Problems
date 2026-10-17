class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
int c=0;
        int s=0;

        for(int i=0;i<k;i++){
            s=s+arr[i];


        }

        
        if((s/k)>=threshold){
            c++;

        }

        int i=0;
        int j=k;


        while(j<arr.length){
            s=s-arr[i];
            i++;
            s=s+arr[j];
            j++;

             if((s/k)>=threshold){
            c++;

        }

        }


        return c;

      

    
        
    }
}