class Solution {
    public String convertToTitle(int n) {
        String res="";
        while(n>0){
            n--;
            int d=n%26;
            char c=(char)('A'+d);
             res=c+res;
             n/=26;
        }
        return res;
    }
}