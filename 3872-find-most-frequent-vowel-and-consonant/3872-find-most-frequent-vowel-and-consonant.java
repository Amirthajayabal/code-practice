class Solution {
    public int maxFreqSum(String s) {
        String s1=s.toLowerCase();
        int[]freq=new int[26];
        for(int i=0;i<s1.length();i++){
            char c=s1.charAt(i);
            freq[c-'a']++;
        }
        int maxvowel=0;
          if(freq['a'-'a']>maxvowel){

            maxvowel=freq['a'-'a'];
          }
          if(freq['e'-'a']>maxvowel){
            maxvowel=freq['e'-'a'];
          }
          if(freq['i'-'a']>maxvowel){
            maxvowel=freq['i'-'a'];
          }
          if(freq['o'-'a']>maxvowel){
            maxvowel=freq['o'-'a'];
          }
          if(freq['u'-'a']>maxvowel){
            maxvowel=freq['u'-'a'];
          }
        
        int maxcons=0;
        for(int i=0;i<26;i++){
            char c=(char)(i+'a');
            if(c!='a'&&c!='e' && c!='i'&&c!='o'&&c!='u'){
               if(freq[i]>maxcons){
                 maxcons=freq[i];
               }
            }
        }
        int sum=maxvowel+maxcons;
        return sum;
    }
}