import java.util.*;

class Solution {
    public String originalDigits(String s) {

        int arr[] = new int[10];

        HashMap<Character,Integer> kk = new HashMap<>();

        for(int i=0;i<s.length();i++){
            if(kk.containsKey(s.charAt(i))){
                kk.put(s.charAt(i),kk.get(s.charAt(i))+1);
            }
            else{
                kk.put(s.charAt(i),1);
            }
        }

        if(kk.containsKey('z')){
            arr[0] = kk.get('z');
        }

        if(kk.containsKey('w')){
            arr[2] = kk.get('w');
        }

        if(kk.containsKey('u')){
            arr[4] = kk.get('u');
        }

        if(kk.containsKey('x')){
            arr[6] = kk.get('x');
        }

        if(kk.containsKey('g')){
            arr[8] = kk.get('g');
        }

        if(kk.containsKey('h')){
            arr[3] = kk.get('h')-arr[8];
        }

        if(kk.containsKey('f')){
            arr[5] = kk.get('f')-arr[4];
        }

        if(kk.containsKey('s')){
            arr[7] = kk.get('s')-arr[6];
        }

        if(kk.containsKey('i')){
            arr[9] = kk.get('i')-arr[5]-arr[6]-arr[8];
        }

        if(kk.containsKey('o')){
            arr[1] = kk.get('o')-arr[0]-arr[2]-arr[4];
        }

        StringBuilder res = new StringBuilder();

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i];j++){
                res.append((char)(i+'0'));
            }
        }

        return res.toString();
    }
}
