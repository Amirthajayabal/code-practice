class Solution {
    public boolean validMountainArray(int[] arr) {
        int a=0,n=arr.length,d=n-1;
  if(n<3)
  return false;
        while(a<n-1)
    {
        if(arr[a]<arr[a+1])
        a++;
        else
        break;
    }
    while(d>0)
    {
      if(arr[d]<arr[d-1])
      {
        d--;
      }  
      else
      break;
    }
     if(a==d && a>0 && d<n-1)
     return true;
     else 
     return false;
    }
}