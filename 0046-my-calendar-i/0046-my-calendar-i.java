import java.util.HashMap;
class MyCalendar {
  HashMap<Integer,Integer> ll =new HashMap<>();
    public MyCalendar() {
        
    }
    
    public boolean book(int startTime, int endTime) {

        for(Map.Entry<Integer,Integer> kk:ll.entrySet()){
            if(kk.getValue()>startTime && kk.getKey()<endTime ){
                return false;
            }
        }
        ll.put(startTime,endTime);
        return true;

        
    }
}

/**
 * Your MyCalendar object will be instantiated and called as such:
 * MyCalendar obj = new MyCalendar();
 * boolean param_1 = obj.book(startTime,endTime);
 */