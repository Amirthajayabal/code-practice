class Solution {
    public String convertToTitle(int columnNumber) {
        String res="";
        while(columnNumber>0){
            columnNumber--;
            int rem=columnNumber%26;
            char c=(char)('A'+rem);
            res=c+res;
            columnNumber/=26;
        }
        return res;
    }
}