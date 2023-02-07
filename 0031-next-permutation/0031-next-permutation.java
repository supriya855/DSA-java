class Solution {
    public void nextPermutation(int[] nums) {
        int i=nums.length-2;
        while(i>=0 && nums[i+1]<=nums[i]) i--;// here nums[i+1]<nums[i] coz we are checking nums[i] is the non increasing number here
        if(i>=0){//  i values is where find non -increasing number
          int j=nums.length-1;
            while(nums[j]<=nums[i]) j--;
            swap(nums,i,j);
        }
        reverse(nums,i+1,nums.length-1);
        
    }
    public void swap(int[] nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    public void reverse(int[] nums,int i,int j){
        while(i<j) swap(nums,i++,j--);
    }
    /* Intuition
    step1: Traverse through the array in from end to get non incresing number easily
    step2: check again array from end is there any number which greater than the number we find in first step if it then swap
    after that to the next index of first number reverse the values
    for Ex : [1,3,5,4,2]
      -> i=5-2=3
      while(i>=0&&nums[i]>nums[i+1]) i.e 3>=0&&nums[3]&&nums[3+1] i.e 4>2 true decrease i then i becomes 2
    i=2:  nums[2]>nums[3]-> 5>4  true i-- i,e 
      i=1 :then nums[1]>nums[2] false then i becomes 1
      similary we are checking the highst element to nums[1] (3)
      while(nums[j]<=nums[i]) j-- decrementing until we find nums[j]>nums[i] then swaap
      after that reverse from i+1*/
    //---> here there edge case i.e [1,1] and the next permu is the array itself
}