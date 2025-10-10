class Solution {
    public int gcdOfOddEvenSums(int n) {
        int sumodd=n*n;
        int sumeven=n*(n+1);
        return gcd(sumodd,sumeven);
    }
    public int gcd(int a,int b){
        while(b!=0){
            int ep=b;
            b=a%b;
            a=ep;
        }
return a;
    }
}