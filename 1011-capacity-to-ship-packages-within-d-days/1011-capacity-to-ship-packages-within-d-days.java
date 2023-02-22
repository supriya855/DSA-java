class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int low=0;
        int high=0;
        for(int w:weights){
            low=Math.max(low,w);
            high+=w;
        }
        int capacity=0;
        while(low<=high){
            int mid=(low+high)/2;
            int day=leastCap(weights,mid);
            if(day>days)
                low=mid+1;
            else{
                capacity=mid;
                high=mid-1;
            }
        }
        return capacity;
    }
    public int leastCap(int[] weights,int cap){
        int daysReq=1;
        int curr=0;
        for(int w:weights){
            curr+=w;
            if(curr>cap){
                daysReq++;
                curr=w;
            }
        }
        return daysReq;
    }
}
 