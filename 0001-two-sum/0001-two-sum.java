class Solution {
    public int[] twoSum(int[] nums, int target) {
//         int[] arr = new int[2];
//         int k=0;
//         for(int i=0;i<nums.length;i++){
//             for(int j=i+1;j<=nums.length-1;j++){
//                 if(nums[i]+nums[j]==target){
//                     arr[k++]=i;
//                     arr[k++]=j;
    
                    
//                 }
                
//             }
//         }
//         return arr;
//     }
        // for(int i=0;i<nums.length;i++){
        //     for(int j=i+1;j<nums.length;j++){
        //         if(nums[j]==target-nums[i]){
        //             return new int[] {i,j}; 
        //         }
        //     }
        // }
        // return null;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],i);
        }
        for(int i=0;i<nums.length;i++){
            int complement = target-nums[i];
        if(map.containsKey(complement)&& map.get(complement)!=i){
            return new int[]{i,map.get(target-nums[i])};
        }     
}
        return null;
    }
        
}