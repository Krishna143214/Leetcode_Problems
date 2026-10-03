import java.util.ArrayList;
class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
    ArrayList<Integer> ll=new ArrayList<>();

        for(int i=left;i<=right;i++){
    
    int r=i;
    int f=0;

    while(r>0){
        int m=r%10;

       

        if(m==0||i%m!=0){
            f=1;
            break;
        }
        r=r/10;
    }

    if(f==0){
        ll.add(i);
    }


          
        }


        return ll;
        
    }
}