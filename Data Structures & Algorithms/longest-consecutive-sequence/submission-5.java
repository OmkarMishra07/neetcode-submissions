class Solution {
    public int longestConsecutive(int[] nums) {

        int n = nums.length;
        HashSet<Integer> map= new HashSet<>();
        for(int i = 0 ; i<nums.length; i++){
            map.add(nums[i]);
        }
        int longest = 0;
        for(int num : map){
            if(!map.contains(num-1)){
                int current = num;
                int count = 1;

                while(map.contains(current+1)){
                    current++;
                    count++;
                }
                longest = Math.max(longest,count);
            }
        }
        return longest;
        
    }
}
