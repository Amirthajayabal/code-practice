class Solution {
    public int arrangeCoins(int n) {
        long count=0;
        for(int i=1;i<=n;i++){
            if(n<i)
                break;
                n=n-i;
                count++;
        }
        return (int)count;
    }
}