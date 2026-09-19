class Solution {

    static int rev(int a){
        int res=0;

        while(a>0){
            int r=a%10;
            res=res*10+r;
            a=a/10;
        }

        return res;
    }
    public int sumOfPrimesInRange(int n) {

        int b=rev(n);



        int min=0;
        int max=0;


        if(n>b){
            max=n;
            min=b;
        }

        else{
            max=b;
            min=n;
        }

int r=0;

        for(int i=min;i<=max;i++){

            int c=0;

            for(int j=1;j<=i;j++){

                if(i%j==0){
                    c++;
                }
            }

            if(c==2){
                r=r+i;
            }
        }

        return r;

        

        
    }
}