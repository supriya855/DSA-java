class Solution {
    public int singleNonDuplicate(int[] nums) {
       int s=0,e=nums.length-1;
        // while(s<e){
        //     int mid=s+(e-s)/2;
        //     if((mid%2==0&&nums[mid]==nums[mid+1])||(mid%2==1&&nums[mid]==nums[mid-1])){
        //         s=mid+1;
        //     }
        //        else{
        //            e=mid;
        //        }
        // }
        //        return nums[s];
        int unique=0;
        for(int i=0;i<nums.length;i++){
            unique^=nums[i];
        }
        return unique;
    }
}