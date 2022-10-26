class Solution {
    public boolean check(int[] nums) {
    //    Tried but not get the ans int x=0;
    //     int[] arr =new int[nums.length];
    //      for(int i=0;i<nums.length;i++){
    //        arr[i]=nums[i];
    //    }
    //     Arrays.sort(arr);
    //     for(int i=0;i<arr.length;i++){
    //         if(arr[0]==nums[i]){
    //             x=i;
    //             System.out.println(x);
    //             break;
    //         }
    //     }
    //     // int i=0;
    //     for(int i=0;i<arr.length;i++){
    //         if(arr[i]==nums[(i+x)%arr.length]){
    //            continue;
    //         }
    //         else{
    //             return false;
    //         }
    //     }
    //  return true;
    // }  
        if(nums.length==1){
            return true;
        }
        int count=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]>nums[i]){
                count++;
            }
        }
        if(nums[nums.length-1]>nums[0]){
            count++;
        }
        return count<=1;
    }
}