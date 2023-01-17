class Solution {
    public int findNumbers(int[] nums) {
        int count=0;
       
        int evenCount=0;
        for(int i=0;i<nums.length;i++){
            while(nums[i]!=0){
                int rem=nums[i]%10;
                evenCount++;
                nums[i]=nums[i]/10;
                
            }
            System.out.print(evenCount+" ");
           
            if(evenCount%2==0) count++;
            evenCount=0;
            
            
        }
        return count;
    }
}