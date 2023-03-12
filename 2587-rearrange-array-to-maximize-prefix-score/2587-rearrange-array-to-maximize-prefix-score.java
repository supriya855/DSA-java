class Solution {
    public int maxScore(int[] nums) {
        int count=0;
        Arrays.sort(nums);
        long[] res = new long[nums.length];
        long sum=0;
        for(int i=nums.length-1;i>=0;i--){
            sum+=nums[i];
            res[i]=sum;
            if(res[i]>0) count++;
        }
        return count;
       
    }
}