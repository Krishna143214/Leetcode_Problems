class Solution {
    public int countSymmetricIntegers(int low, int high) {

int c=0;
        for(int i=low;i<=high;i++){
            String a=Integer.toString(i);

            if(a.length()%2==0){
int d=0;
                for(int j=0;j<a.length()/2;j++){

                    d=d+a.charAt(j)-'0';

                }

                int e=0;

                  for(int j=a.length()/2;j<a.length();j++){

                    e=e+a.charAt(j)-'0';

                }

                if(d==e){
                    c++;
                }

            }
        }

        return c;
        
    }
}