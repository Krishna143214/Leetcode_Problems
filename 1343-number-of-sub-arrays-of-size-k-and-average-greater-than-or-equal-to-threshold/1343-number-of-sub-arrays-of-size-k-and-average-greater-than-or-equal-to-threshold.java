class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {

    int v=0;    

  for(int ii=0;ii<k;ii++){
    v=v+arr[ii];
  }

  int i=0;
        int j=k;
        int c=0;

          if(v/k>=threshold){
                c++;
            }

        while(j<arr.length){
          
            v=v-arr[i];
            i++;
            v=v+arr[j];
            j++;
              if(v/k>=threshold){
                c++;
            }
        }

        return c;
      

    
        
    }
}