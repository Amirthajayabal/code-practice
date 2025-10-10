class Solution {
    public boolean checkDivisibility(int n) {
        int t=n;
        int sum=0;
        int prod=1;
        while(n>0){
            int dig=n%10;
            sum+=dig;
            prod*=dig;
            n/=10;
        }
        int sum2=sum+prod;
        if(t%sum2==0){
            return true;
        }
        return false;
    }
}