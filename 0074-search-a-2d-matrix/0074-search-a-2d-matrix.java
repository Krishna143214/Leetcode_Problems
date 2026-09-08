class Solution {
    public boolean searchMatrix(int[][] ma, int t) {

int i=0;
int j=ma.length-1;

while(i<=j){
    int mid=(i+j)/2;

    if(ma[mid][0]<=t &&ma[mid][ma[0].length-1]>=t){

        int l=0;
        int h=ma[0].length-1;

        while(l<=h){
            int m=(l+h)/2;

            if(ma[mid][m]==t){
                return true;
            }
            else if(ma[mid][m]>t){
              h=m-1;
            }
            else{
                l=m+1;
            }
        }

        break;

    }

    else if(ma[mid][0]>t ){
        j=mid-1;
    }

     else  {
        i=mid+1;
    }
}

    return false;    
    }
}