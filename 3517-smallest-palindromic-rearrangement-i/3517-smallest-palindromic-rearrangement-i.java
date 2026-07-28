import java.util.Arrays;

class Solution {
    public String smallestPalindrome(String s) {


if(s.length()==1){
    return s;
}

char a[]=s.toCharArray();


if(s.length()%2==0){

    char fir[]=new char[s.length()/2];
    int f=0;
    for(int i=0;i<s.length()/2;i++){
        fir[f]=s.charAt(i);
        f++;
    }


    Arrays.sort(fir);

    char ans[]=new char[s.length()];
    int t=0;

    for(int i=0;i<fir.length;i++){
    ans[t]=fir[i];
    t++;

    }

    for(int i=fir.length-1;i>=0;i--){
        ans[t]=fir[i];
        t++;
    }


    return new String(ans);

}


char sec[]=new char[s.length()/2];
int j=0;
int o=0;
for(o=0;o<s.length()/2;o++){
    sec[j]=s.charAt(o);
    j++;
}
Arrays.sort(sec);

char ans[]=new char[s.length()];
int p=0;

for(int i=0;i<sec.length;i++){
    ans[p]=sec[i];
    p++;
}
ans[p]=s.charAt(o);
p++;

for(int i=sec.length-1;i>=0;i--){
    ans[p]=sec[i];
    p++;
}


return new String(ans);


       
        
    }
}