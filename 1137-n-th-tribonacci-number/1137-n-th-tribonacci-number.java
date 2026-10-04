class Solution {
    public int tribonacci(int n) {

        if(n==0||n==1){
            return n;
        }
        if(n==2){
            return 1;

        }
        if(n==3){
            return 2;
        }
        

        int a=0;
        int b=1;
        int c=1;

int r=0;
int out=0;
        for(int i=4;i<=n;i++){

            r=a+b+c;
            a=b;
            b=c;
            c=r;

            out=a+b+c;

        }


        return out;
        
    }
}