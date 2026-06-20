class Solution {
    public boolean checkInclusion(String s1, String s2) {
        Set<Character> set = new HashSet<>();
        int n1 = s1.length();
        int n2 = s2.length();
        int[] s1_freq = new int[26];
        int[] wind_cnt = new int[26];
        if(s1.length()>s2.length()) return false;
        for(int i = 0 ; i<n1 ; i++){
            s1_freq[s1.charAt(i) - 'a']++;
            wind_cnt[s2.charAt(i) - 'a']++;
        }
        if(matches(s1_freq,wind_cnt)) return true;

        for(int i = n1 ; i<n2 ; i++){
            wind_cnt[s2.charAt(i)- 'a']++;
            wind_cnt[s2.charAt(i-n1) - 'a']--;

            if(matches(s1_freq, wind_cnt)) return true;
        }

        return false;
        
    }
    public boolean matches(int[] arr1 , int[] arr2){
        int n = arr1.length;
        for(int i = 0 ; i< n ; i++){
            if(arr1[i]!=arr2[i]) return false;
        }
        return true;
    }
}
