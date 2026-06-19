class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i = 0;
        int j = 0;
        int max = 0;
        int n = s.length();
        int[] freq = new int[128];

        while(j<n){
            char ch = s.charAt(j);
            freq[ch]++;
            if(freq[ch]>1){
                while(s.charAt(i) != ch){
                    freq[s.charAt(i)]--;
                    i++;
                }
                freq[s.charAt(i)]--;
                i++;
            }
            max = Math.max(max , j-i+1);
            j++;
        }
        return max;
    }
}
