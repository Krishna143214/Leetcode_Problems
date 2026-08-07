import java.util.HashMap;
class MapSum {
    HashMap<String,Integer> kk=new HashMap<>();

    public MapSum() {
        
    }
    
    public void insert(String key, int val) {
        kk.put(key,val);
        
    }
    
    public int sum(String prefix) {
        int c=0;

        for(Map.Entry<String,Integer> ll:kk.entrySet()){
            String a=ll.getKey();

            if(prefix.length()>a.length()){
                continue;
            }

            int f=0;

            for(int i=0;i<prefix.length();i++){
                if(a.charAt(i)!=prefix.charAt(i)){
                    f=1;
                }
            }

            if(f==0){
                c=c+ll.getValue();
            }


            


        }
 
 return c;

        }

       
        
    }

/**
 * Your MapSum object will be instantiated and called as such:
 * MapSum obj = new MapSum();
 * obj.insert(key,val);
 * int param_2 = obj.sum(prefix);
 */