class Solution {
    public List<Integer> findPeaks(int[] mo) {

        ArrayList<Integer> kk=new ArrayList<>();

        for(int i=1;i<mo.length-1;i++){

            if(mo[i]>mo[i+1]&&mo[i]>mo[i-1]){
                kk.add(i);
            }

        }


        return kk;
        
    }
}