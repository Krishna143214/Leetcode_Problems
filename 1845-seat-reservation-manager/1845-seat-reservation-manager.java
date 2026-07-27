import java.util.PriorityQueue;

class SeatManager {
    PriorityQueue<Integer> kk=new PriorityQueue<>();

    public SeatManager(int n) {

     for(int i=1;i<=n;i++){
        kk.add(i);
     }
        
    }
    
    public int reserve() {
 return kk.poll();
        
    }
    
    public void unreserve(int seatNumber) {
     kk.add(seatNumber);
        
    }
}

/**
 * Your SeatManager object will be instantiated and called as such:
 * SeatManager obj = new SeatManager(n);
 * int param_1 = obj.reserve();
 * obj.unreserve(seatNumber);
 */