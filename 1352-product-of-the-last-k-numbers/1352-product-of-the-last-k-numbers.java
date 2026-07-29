


class ProductOfNumbers {

    int arr[]=new int[40000];
    int i=0;

    public ProductOfNumbers() {
        
    }
    
    public void add(int num) {
        arr[i]=num;
        i++;
      
        
    }
    
    public int getProduct(int k) {

        int till=i-k;
        int ans=1;

        for(int j=till;j<i;j++){
            ans=ans*arr[j];

        }
     
      return ans;  
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */