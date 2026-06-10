class Solution {
    public int maxArea(int[] heights) {
        int i = 0 ;
        int j = heights.length-1;
        int max = Integer.MIN_VALUE;
        while(i<j){
            int height = Math.min(heights[i] , heights[j]);
            int area = height * (j-i);
            max = Math.max(area,max);
            if(heights[i] > heights[j]) j--;
            else i++;
        }
        return max;
    }
}
