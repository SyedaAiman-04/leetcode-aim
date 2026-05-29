class Solution {
    public int minElement(int[] nums) {
        int ans = Integer.MAX_VALUE;
        for(int n:nums){
            int min=0;
            while(n>0){
            min += n%10;
            n=n/10;
            }
            ans = Math.min(ans, min);
        }
        return ans;
        }
}