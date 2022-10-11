class Solution {
    public int[] singleNumber(int[] nums) {
      HashMap<Integer, Integer> list = new HashMap<>();
        for (int n : nums)
      list.put(n, list.getOrDefault(n, 0) + 1);
        int[] arr= new int[2];
        int idx=0;
        // int count=0;
        // if(nums.length==2){
        //     return nums;
        // }
        // for(int i = 0; i < nums.length; i++) {
        //     if (list.containsKey(nums[i])) {
        //         count++;
        //         list.put(nums[i], count);
        //     } else {
        //         list.put(nums[i], count);
        //     }
        //     count = 1;
        // }
         for (Map.Entry<Integer, Integer> set :
                list.entrySet()) {

if(set.getValue()==1){
   
    arr[idx++]=set.getKey();    
    }
            
         }
        return arr; 
    }
         
}