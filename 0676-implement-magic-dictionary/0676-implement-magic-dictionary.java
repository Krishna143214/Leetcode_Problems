class MagicDictionary {

    HashSet<String> kk=new HashSet<>();

    public MagicDictionary() {
        
    }
    
    public void buildDict(String[] dictionary) {

        for(String a:dictionary){
            kk.add(a);
        }
        
    }
    
    public boolean search(String sW) {

        for(String a:kk){

            if(sW.length()>a.length()||sW.length()<a.length()){
                continue;
            }


         
int c=0;
            for(int i=0;i<a.length();i++){
                if(a.charAt(i)==sW.charAt(i)){
                  
                }

                else{
                    c++;
               
                    if(c>1){
                        break;
                    }
                }

                
            }

          

            if(c==1){
                return true;
            }



        }

        return false;
        
    }
}

/**
 * Your MagicDictionary object will be instantiated and called as such:
 * MagicDictionary obj = new MagicDictionary();
 * obj.buildDict(dictionary);
 * boolean param_2 = obj.search(searchWord);
 */