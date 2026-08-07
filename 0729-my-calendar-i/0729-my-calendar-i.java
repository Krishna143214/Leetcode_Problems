import java.util.HashMap;
class MyCalendar {
  HashMap<Integer,Integer> kk=new HashMap<>();
    public MyCalendar() {
        
    }
    
    public boolean book(int startTime, int endTime) {
        for(Map.Entry<Integer,Integer> ll: kk.entrySet()){
            if(startTime<ll.getValue()&& ll.getKey()<endTime){
               
                return false;
            }
        }
         kk.put(startTime,endTime);
return true;

        
    }
}

/**
 * Your MyCalendar object will be instantiated and called as such:
 * MyCalendar obj = new MyCalendar();
 * boolean param_1 = obj.book(startTime,endTime);
 */