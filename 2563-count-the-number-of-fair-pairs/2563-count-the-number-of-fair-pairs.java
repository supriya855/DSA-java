class Solution {
    public long countFairPairs(int[] nums, int lower, int upper) {
       Arrays.sort(nums);
        int start=0;
        int end=nums.length-1;
        long upperCount=0;
        long lowerCount=0;
        while(start<end){
            if(nums[start]+nums[end]<=upper){
                upperCount+=end-start;
                start++;
            }
            else
                end--;
        }
        start=0;
        end=nums.length-1;
         while(start<end){
            if(nums[start]+nums[end]<lower){
                lowerCount+=end-start;
                start++;
            }
            else
                end--;
        }
        
       return upperCount-lowerCount; 
    }
}