import java.util.*;

class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {

        HashMap<Integer,Integer> kk = new HashMap<>();
        List<List<Integer>> ans = new ArrayList<>();

        for(int a : nums) {
            if(kk.containsKey(a)) {
                kk.put(a, kk.get(a) + 1);
            }
            else {
                kk.put(a, 1);
            }
        }

        while(kk.size() > 0) {

            ArrayList<Integer> res = new ArrayList<>();

            Iterator<Map.Entry<Integer,Integer>> it = kk.entrySet().iterator();

            while(it.hasNext()) {

                Map.Entry<Integer,Integer> nn = it.next();

                res.add(nn.getKey());

                if(nn.getValue() == 1) {
                    it.remove();
                }
                else {
                    nn.setValue(nn.getValue() - 1);
                }
            }

            ans.add(res);
        }

        return ans;
    }
}