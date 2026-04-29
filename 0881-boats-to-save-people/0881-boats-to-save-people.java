class Solution {
    public int numRescueBoats(int[] people, int limit) {

        int n = people.length;
        int b =0;
        int r = n - 1;
        int l = 0;
        Arrays.sort(people);
        while (l <= r) {
            if (people[l] + people[r] > limit) {
                b++;
                
                
            }else if(people[l] + people[r] <= limit){
                b++;
                l++;
                
            }
            r--;
        }
        return b;
    }
}