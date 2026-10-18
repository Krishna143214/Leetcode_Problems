class Solution {
    public long dividePlayers(int[] skill) {

        Arrays.sort(skill);

        int a=skill[0]+skill[skill.length-1];

        int i=0;
        int j=skill.length-1;
        long g=0;

        while(i<j){
            int s=skill[i]+skill[j];

            if(s!=a){
                return -1;
            }

            else{
                g=g+(skill[i]*skill[j]);
            }
            i++;
            j--;
        }


        return g;
        
    }
}