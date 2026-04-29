class Solution {
    public boolean lemonadeChange(int[] bills) {
        
        int a = 0;
        int b = 0;

        int n = bills.length;

        for(int i =0; i<n;i++)
        {
            if(bills[i] == 5)
            {
                a+= 1;
            }
            if(bills[i]==10)
            {
                if(a>0)
                {
                    a -=1;
                    b+=1;
                }else{
                    return false;
                }
            }
            if(bills[i]==20)
            {
                if(a>0 && b>0)
                {
                    a -=1;
                    b -=1;

                }else if(a>=3)
                {
                    a -=3;

                }else{
                    return false;
                }
            }
        }
        return true;
    }
}