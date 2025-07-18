class Solution {
    public boolean canWinNim(int n) {
        if(n<=3){
            return true;
        }
        int res=n%4;
        if(res==0){
            return false;
        }
        return true;
    }
}