import java.util.PriorityQueue;
import java.util.HashSet;
class SmallestInfiniteSet {
    PriorityQueue<Integer> kk=new PriorityQueue<>();
    HashSet<Integer> mm=new HashSet<>();

    public SmallestInfiniteSet() {
        for(int i=1;i<=1001;i++){
            kk.add(i);
            mm.add(i);
        }
        
    }
    
    public int popSmallest() {
        int g=kk.poll();
        mm.remove(g);
        
        return g;
        
        
    }
    
    public void addBack(int num) {
     
     if(!mm.contains(num)){
        kk.add(num);
        mm.add(num);
     }
     
     
     
     }

   
        
    }


/**
 * Your SmallestInfiniteSet object will be instantiated and called as such:
 * SmallestInfiniteSet obj = new SmallestInfiniteSet();
 * int param_1 = obj.popSmallest();
 * obj.addBack(num);
 */