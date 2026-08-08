import java.util.HashSet;

class Trie {
    HashSet<String> kk=new HashSet<>();

    public Trie() {
        
    }
    
    public void insert(String word) {
        kk.add(word);
        
    }
    
    public boolean search(String word) {
        if(kk.contains(word)){
            return true;
        }
        return false;
        
    }
    
    public boolean startsWith(String prefix) {
        int kkk=0;

        for(String k:kk){
            String j=k;
            if(j.length()<prefix.length()){
                continue;
            }

            int f=0;

            for(int i=0;i<prefix.length();i++){
                if(prefix.charAt(i)!=j.charAt(i)){
                    f=1;
                }
            }

            if(f==0){
                kkk=1;
                break;
            }

            continue;
        }

        if(kkk==0){
            return false;
        }
        return true;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */