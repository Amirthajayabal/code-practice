class Solution {
    public boolean checkPrimeFrequency(int[] nums) {
        int[]freq=new int[101];
        for(int i:nums){
            freq[i]++;
        }
        for(int i:freq){
            if(isprime(i)&&(i>1)){
                return true;
            }
        }
        return false;
    }
    public boolean isprime(int n){
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}