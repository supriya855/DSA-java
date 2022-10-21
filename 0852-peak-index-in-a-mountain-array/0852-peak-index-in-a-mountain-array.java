class Solution {
    public int peakIndexInMountainArray(int[] arr) {
  /*
  This is the brute force approach time complexity is O(n)
  int max=0,c=0;
        for(int i=0;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
                c=i;
            }
        }
        return c;*/
    int s=0;
    int e=arr.length-1;
        while(s<e){
    int mid=s+(e-s)/2;
            if(arr[mid]>arr[mid+1]){
                e=mid;
            }
            else{
                s=mid+1;
            }
        }
        return s;
    }
}
       