class Solution {
    public int majorityElement(int[] nums) {
        int count=0;
        int canditate=0;
        for(int num:nums){
            if(count==0){
                canditate=num;
            }
            count+=(num==canditate)?1:-1;
        }
        return canditate;
    }
}