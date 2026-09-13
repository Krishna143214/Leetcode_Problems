class Solution {
    public List<Integer> filterRestaurants(int[][] r, int v, int mp, int md) {

        if(v==1){
            PriorityQueue<pair> kk=new PriorityQueue<>(
                (a,b)->{
                    if(a.rate!=b.rate){
                        return b.rate-a.rate;
                    }

                    return b.id-a.id;
                }
            );



            for(int i=0;i<r.length;i++){
                if(r[i][2]==0||r[i][3]>mp||r[i][4]>md){
                    continue;
                }
                kk.add(new pair(r[i][0],r[i][1]));
            }



            ArrayList<Integer> res=new ArrayList<>();

            while(!kk.isEmpty()){
                pair f=kk.poll();
                res.add(f.id);
            }


            return res;

        }



         PriorityQueue<pair> kk=new PriorityQueue<>(
                (a,b)->{
                    if(a.rate!=b.rate){
                        return b.rate-a.rate;
                    }

                    return b.id-a.id;
                }
            );



            for(int i=0;i<r.length;i++){
                 if(r[i][3]>mp||r[i][4]>md){
                    continue;
                }
             
                kk.add(new pair(r[i][0],r[i][1]));
            }



            ArrayList<Integer> res=new ArrayList<>();

            while(!kk.isEmpty()){
                pair f=kk.poll();
                res.add(f.id);
            }


            return res;
        
    }
}


class pair{
    int id;
    int rate;
    

    pair(int a,int b){
        id=a;
        rate=b;
       

    }
}