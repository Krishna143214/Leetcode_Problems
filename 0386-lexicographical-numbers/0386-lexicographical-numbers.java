class Solution {
    
    public List<Integer> lexicalOrder(int n) {

        ArrayList<String> ll=new ArrayList<>();


        for(int i=1;i<=n;i++){
            ll.add(Integer.toString(i));

        }

        Collections.sort(ll);


        ArrayList<Integer> kk=new ArrayList<>();


        for(String b:ll){

            kk.add(Integer.parseInt(b));

        }


        return kk;


        
    }
}