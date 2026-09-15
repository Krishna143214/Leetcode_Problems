class Solution {
    public int nextBeautifulNumber(int n) {

        int i=n+1;

        while(true){
            HashMap<Character,Integer> kk=new HashMap<>();
            String a=Integer.toString(i);

            for(int ii=0;ii<a.length();ii++){
                if(kk.containsKey(a.charAt(ii))){
                    kk.put(a.charAt(ii),kk.get(a.charAt(ii))+1);
                }
                else{
                    kk.put(a.charAt(ii),1);
                }
            }

            int f=0;

            for(Map.Entry<Character,Integer> nn:kk.entrySet()){

                if(nn.getKey()-'0'!=nn.getValue()){
                    f=1;
                    break;
                }
            }

            if(f==0){
                return i;
            }

            i++;


        }

        
    }
}