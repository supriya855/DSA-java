class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] positive= new int[nums.length/2];
        int[] negative = new int[nums.length/2];
        int[] mix= new int[nums.length];
        int k=0,l=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                positive[k++]=nums[i];
            }
            else{
                negative[l++]=nums[i];
            }
        }
        System.out.println(Arrays.toString(positive));
        System.out.println(Arrays.toString(negative));
        int i=0,p=0,q=0;
        while(i<mix.length){
            if(i%2==0){
                mix[i]=positive[p++];
            }
            else{
                mix[i]=negative[q++];
            }
            i++;
        }
        return mix;
    }
}