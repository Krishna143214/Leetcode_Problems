import java.util.HashMap;
import java.util.PriorityQueue;

class AuctionSystem {

    HashMap<Integer,HashMap<Integer,Integer>> kk = new HashMap<>();

    HashMap<Integer,PriorityQueue<pair>> pp = new HashMap<>();

    public AuctionSystem() {

    }

    public void addBid(int userId, int itemId, int bidAmount) {

        if(!kk.containsKey(userId)){
            kk.put(userId,new HashMap<Integer,Integer>());
        }

        kk.get(userId).put(itemId,bidAmount);

        if(!pp.containsKey(itemId)){
            pp.put(itemId,new PriorityQueue<>(
                (a,b)->{
                    if(a.amou!=b.amou){
                        return b.amou-a.amou;
                    }
                    return b.uid-a.uid;
                }
            ));
        }

        pp.get(itemId).add(new pair(userId,itemId,bidAmount));
    }

    public void updateBid(int userId, int itemId, int newAmount) {

        kk.get(userId).put(itemId,newAmount);

        pp.get(itemId).add(new pair(userId,itemId,newAmount));
    }

    public void removeBid(int userId, int itemId) {

        kk.get(userId).remove(itemId);

    }

    public int getHighestBidder(int itemId) {

        if(!pp.containsKey(itemId)){
            return -1;
        }

        PriorityQueue<pair> l = pp.get(itemId);

        while(!l.isEmpty()){

            pair oo = l.peek();

            if(kk.containsKey(oo.uid) &&
               kk.get(oo.uid).containsKey(itemId) &&
               kk.get(oo.uid).get(itemId) == oo.amou){

                return oo.uid;
            }

            l.poll();
        }

        return -1;
    }
}

class pair{

    int uid;
    int iid;
    int amou;

    pair(int a,int b,int c){
        uid=a;
        iid=b;
        amou=c;
    }
}

/**
 * Your AuctionSystem object will be instantiated and called as such:
 * AuctionSystem obj = new AuctionSystem();
 * obj.addBid(userId,itemId,bidAmount);
 * obj.updateBid(userId,itemId,newAmount);
 * obj.removeBid(userId,itemId);
 * int param_4 = obj.getHighestBidder(itemId);
 */