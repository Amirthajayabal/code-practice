class Solution {
    public boolean checkDivisibility(int n) {
        int prod=1;
        int sum=0;
        int temp=n;
        while(n>0){
            int dig=n%10;
            sum+=dig;
            prod*=dig;
            n/=10;
        }
        int sum2=sum+prod;
        if(temp%sum2!=0){
            return false;
        }
        return true;
    }
}