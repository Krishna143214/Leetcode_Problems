import java.util.HashMap;
class MyHashMap {
  HashMap<Integer,Integer> kk=new HashMap<>();
    public MyHashMap() {
        
    }
    
    public void put(int key, int value) {

        kk.put(key,value);
        
    }
    
    public int get(int key) {
        if(!kk.containsKey(key)){
            return -1;
        }
        return kk.get(key);
    }
    
    public void remove(int key) {
        kk.remove(key);
        
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */