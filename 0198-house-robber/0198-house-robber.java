class Solution {
    public int rob(int[] nums) {
     int pNo=0;
     int pYes=0;
        for(int n:nums){
           int temp=pNo;
            pNo=Math.max(pNo,pYes);
            pYes=n+temp;
        }
        return Math.max(pNo,pYes);
    }
}