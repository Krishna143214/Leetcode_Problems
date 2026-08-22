class Solution {

    static int sum(int a){
        int s=0;
        int pro=1;

        while(a>0){
            int r=a%10;
            s=s+r;
               pro=pro*r;
            a=a/10;
        }

        return s+pro;
    }

    public boolean checkDivisibility(int n) {

    return (n%sum(n))==0;
        
    }
}