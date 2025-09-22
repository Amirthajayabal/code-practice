class Solution {
    public int countDigits(int num) {
        int og=num;
        int count=0;
        while(num>0){
            int dig=num%10;
            if(dig!=0 && og%dig==0){
                count++;
            }
            num/=10;
        }
        return count;
    }
}