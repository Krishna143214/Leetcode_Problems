import java.util.PriorityQueue;
import java.util.HashSet;
class SmallestInfiniteSet {
PriorityQueue<Integer> kk=new PriorityQueue<>();
HashSet<Integer> ll=new HashSet<>();



    public SmallestInfiniteSet() {
        for(int i=1;i<=1000;i++){
    ll.add(i);
    kk.add(i);
}
  
        
    }
    
    public int popSmallest() {
        int a=kk.poll();
        ll.remove(a);

        return a;
        
        
    }
    
    public void addBack(int num) {

        if(!kk.contains(num)){
            kk.add(num);
        }
     
 
     
     
     
     }

   
        
    }


/**
 * Your SmallestInfiniteSet object will be instantiated and called as such:
 * SmallestInfiniteSet obj = new SmallestInfiniteSet();
 * int param_1 = obj.popSmallest();
 * obj.addBack(num);
 */

/**
 * Your SmallestInfiniteSet object will be instantiated and called as such:
 * SmallestInfiniteSet obj = new SmallestInfiniteSet();
 * int param_1 = obj.popSmallest();
 * obj.addBack(num);
 */


/**
 * Your SmallestInfiniteSet object will be instantiated and called as such:
 * SmallestInfiniteSet obj = new SmallestInfiniteSet();
 * int param_1 = obj.popSmallest();
 * obj.addBack(num);
 */