class Solution {
    public String reverseWords(String s) {
s=s+" ";
int c=0;
StringBuilder kk=new StringBuilder();
int p=-1;

for(int i=0;i<s.length();i++){
    if(s.charAt(i)==' '){
    
        p=i+1;
        break;
    }
    else{
        kk.append(s.charAt(i));

        if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'){
            c++;
        }

    }
}


int m=0;
int cou=0;
StringBuilder t=new StringBuilder();
for(int i=p;i<s.length();i++){

    if(s.charAt(i)==' '){

    if(cou==c){
        kk.append(" ");
        kk.append(t.reverse().toString());
        t.setLength(0);
        cou=0;
    }
    else{
        kk.append(" ");
        kk.append(t.toString());
        t.setLength(0);
        cou=0;
    }

    }

    else{
        t.append(s.charAt(i));

         if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'){
            cou++;
        }

    }

}


return kk.toString();

        
    }
}