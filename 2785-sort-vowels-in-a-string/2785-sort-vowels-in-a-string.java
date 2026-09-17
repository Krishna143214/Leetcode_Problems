class Solution {
    public String sortVowels(String s) {

        StringBuilder kk=new StringBuilder();

        for(int i=0;i<s.length();i++){

             if(s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U'){
                kk.append(s.charAt(i));
            }

             else   if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'){
                kk.append(s.charAt(i));
            }
       
        }




        String a=kk.toString();


        char arr[]=a.toCharArray();

        Arrays.sort(arr);

        int k=0;

StringBuilder mm=new StringBuilder();

char Drr[]=s.toCharArray();

        for(char p:Drr){

              if(p=='A'||p=='E'||p=='I'||p=='O'||p=='U'||p=='a'||p=='e'||p=='i'||p=='o'||p=='u'){
                mm.append(arr[k]);
                k++;
            }

            else{
                mm.append(p);
            }
            
        }

        return mm.toString();
        
    }
}