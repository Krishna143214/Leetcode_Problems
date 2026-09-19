class Solution {
    public int wateringPlants(int[] plants, int capacity) {

        int s=0;

        int cap=capacity;


        for(int i=0;i<plants.length;i++){

            if(plants[i]<=cap){
                cap=cap-plants[i];
                s++;

            }

            else if(plants[i]>cap){
            
                s=s+i;
                s=s+i+1;
                cap=capacity;

                cap=cap-plants[i];
            }

        }


        return s;
        
    }
}