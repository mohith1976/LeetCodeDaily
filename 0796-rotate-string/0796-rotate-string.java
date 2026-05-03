class Solution {
    public boolean rotateString(String s, String goal) {

        for(int i=0; i<= s.length()-1;i++)
        {
            String res = s.substring(i) + s.substring(0, i);
            if(res .equals (goal)) {
                return true;
            }
        }
        return false;
        
    }
}