class Solution {
    public boolean isPerfectSquare(int num) {
       int l =1;
       int r = num;
    //    if(num == 1) return true;
       while(l<=r)
       {
          long mid = (l+r)/2;


          if((long)mid*mid ==num) return true;
          
          if((long)mid*mid > num)
          {
            r = (int)mid-1;
          }else if(mid*mid<num){
            l = (int)mid+1;
          }
         
       }

        return false;
    }
}