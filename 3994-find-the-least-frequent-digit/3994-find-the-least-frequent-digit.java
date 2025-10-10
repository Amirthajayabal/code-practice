class Solution {
    public int getLeastFrequentDigit(int n) {
        int[]freq=new int[10];
        while(n>0){
            int dig=n%10;
            freq[dig]++;
            n/=10;
        }
        int minfreq=Integer.MAX_VALUE;
        int least=-1;
        for(int i=0;i<10;i++){
        if(freq[i]>0 && freq[i]<minfreq){
            minfreq=freq[i];
            least=i;
        }
        }
        return least;
    }
}