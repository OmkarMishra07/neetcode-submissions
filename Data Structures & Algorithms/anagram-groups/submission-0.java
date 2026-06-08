class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs.length == 0) return new ArrayList<>();
        Map<String,List<String>> map = new HashMap<>();
        for(int i = 0; i<strs.length; i++){
            String str1 = strs[i];
            char[] arr = strs[i].toCharArray();
            Arrays.sort(arr);
            String str2 = String.valueOf(arr);
            map.computeIfAbsent(str2, k -> new ArrayList<>()).add(str1);
        }
        return new ArrayList<>(map.values());
    }
}
