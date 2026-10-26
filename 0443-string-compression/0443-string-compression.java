

class Solution {
    public int compress(char[] arr) {

        if(arr.length==1){
            return 1;
        }

        int i=0;


        StringBuilder kk=new StringBuilder();

        while(i<arr.length){

           if(i<arr.length-1){

            if(arr[i]==arr[i+1]){
              int c=0;
            while(i<arr.length-1&&arr[i]==arr[i+1]){
                c++;
                i++;

            }
            kk.append(arr[i]);
            c++;
            kk.append(Integer.toString(c));
            i++;

            
            }

            else{
                kk.append(arr[i]);
                i++;
            }}

            else if(arr[i]!=arr[i-1]){
                kk.append(arr[i]);
                i++;
            }
        }



       for(int j=0;j<kk.length();j++){
        arr[j]=kk.charAt(j);
       } 


        return kk.length();

    

        
    }
}