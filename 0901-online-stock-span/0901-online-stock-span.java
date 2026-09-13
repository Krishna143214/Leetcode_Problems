class StockSpanner {
     int arr[]=new int[100000];
     int k=0;

    public StockSpanner() {
        
    }
    
    public int next(int price) {
     arr[k]=price;
     k++;

     int c=0;

     for(int i=k-1;i>=0;i--){
        if(arr[i]<=price){
        c++;
        }
        else{
            break;
        }
     }
     



return c;
    
        
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */