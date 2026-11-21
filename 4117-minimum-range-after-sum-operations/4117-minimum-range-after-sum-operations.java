class Solution {
    public int minRange(int a, int b, int c) {



        int arr[]={a,b,c};



int min=Integer.MAX_VALUE;
int max=Integer.MIN_VALUE;

for(int v:arr){


    min=Math.min(min,v);

       max=Math.max(max,v);
    


}


int occ=0;

int n_max=0;
for(int v:arr){
    if(occ==0&&v==max){
        occ=1;
        continue;
    }
    n_max=n_max+v;
}



if(n_max<max){
    return n_max-min;
}


return max-min;





        


        
    }
}