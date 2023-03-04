class Solution {
    public long countSubarrays(int[] nums, int minK, int maxK) {
       int minIdx=-1,maxIdx=-1;
        int start=0;
        long ans=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<minK||nums[i]>maxK){
                minIdx=-1;
                maxIdx=-1;
                start=i+1;
                
            }
            if(nums[i]==minK){
                minIdx=i;
            }
            if(nums[i]==maxK){
                maxIdx=i;
            }
            ans+=Math.max(0,Math.min(minIdx,maxIdx)-start+1);
        }
        return ans;
   }
}