class Solution {
    public int singleNumber(int[] nums) {
//        // HashMap<Integer,Integer> list= new HashMap<Integer,Integer>();
//      int n=nums.length;
//         Arrays.sort(nums);
//  for(int i=0;i<nums.length-1;i+=2){
//      if(n==1){
//          return nums[0];
//      }
//      else if(nums[i]!=nums[i+1]){
//          return nums[i];
//      }
//  }       
        
//     return nums[nums.length-1];
        int unique=0;
        for(int n:nums){
            unique^=n;
        }
        return unique;
    }
}