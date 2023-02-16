class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] res= new int[nums.length];
        int s=1,e=1;
       for(int i=0;i<nums.length;i++){
           res[i]=1;
       }for(int i=0;i<nums.length;i++){
           res[i]*=s;
             s*=nums[i];
       }for(int i=nums.length-1;i>=0;i--){
           res[i]*=e;
             e*=nums[i];
        }
        
        return res;
        
    }
}