class Solution {
    public int minDeletions(String s) {
        int[] freq = new int[26];
        int n = s.length();
        int del =0;
        int r =0;

        s = s.toUpperCase(); 
        while(r<n)
        {
            int c = s.charAt(r) -'A';
            freq[c]++;
            r++;
        }

        HashSet<Integer> set = new HashSet<>();

        for(int i=0; i<freq.length;i++)
        {
                while(freq[i]>0 && set.contains(freq[i])){
                    freq[i]--;
                    del++;
                }

                if(freq[i]>0)
                {
                    set.add(freq[i]);
                }
        }


        return del;
    }
}