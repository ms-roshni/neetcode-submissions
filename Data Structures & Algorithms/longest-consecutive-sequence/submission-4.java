class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int count=0;
        int max=0;
        if(nums.length == 0){
            return 0;
        }
        for(int i=0; i<nums.length-1; i++){
            if(nums[i+1] == nums[i]){
                continue;
            }
            if(nums[i+1] == nums[i] + 1){
                count++;
            }else{
                max = Math.max(count,max);
                count=0;
            }
        }
        return Math.max(count+1, max+1);
    }
}
