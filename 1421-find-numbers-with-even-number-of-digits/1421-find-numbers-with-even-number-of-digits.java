class Solution {
    public int findNumbers(int[] arr) {
       int count1=0;
        for(int i=0;i<arr.length;i++){
            int count=0;
            while(arr[i]>0){
                int dig=arr[i]%10;
                count++;
                arr[i]/=10;
            }
          if(count%2==0){
              count1++;
          }
        }
        return count1;
    }
}