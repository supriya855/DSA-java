class Solution {
    public int numIdenticalPairs(int[] nums) {
        //Brute force approach with O(N2) complexity
        // int c=0;
        // for(int i=0;i<nums.length;i++){
        //     for(int j=i+1;j<nums.length;j++){
        //         if(nums[i]==nums[j]){
        //             c++;
        //         }
        //     }
        // }
        // return c;
        int res=0;
        int [] c= new int[101];
        for(int n:nums){
            res+=c[n]++;
            
        }
        return res;
    }
}