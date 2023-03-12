class Solution {
    public int maxScore(int[] nums) {
        Arrays.sort(nums);
        long[] res = new long[nums.length];
        int[] temp=new int[nums.length];
        for(int k=nums.length-1;k>=0;k--){
            temp[nums.length-k-1]=nums[k];
        }
        long count=0;
        res[0]=temp[0];
        if(res[0]>0) count++;
        for(int i=1;i<nums.length;i++){
            res[i]=res[i-1]+temp[i];
            if(res[i]>0){
               count++;
           }
        }
        System.out.println(Arrays.toString(res));
       
        return (int)count;
    }
}