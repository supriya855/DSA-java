class Solution {
    public int peakIndexInMountainArray(int[] arr) {
  int max=0,c=0;
        for(int i=0;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
                c=i;
            }
        }
        return c;
//     int s=0;
//     int e=arr.length-1;
//     int mid=s+(e-s)/2;
     
//         for(int i=0;i<=mid;i++){
//             if(arr[i]<=arr[mid]){
//                 s++;
//             }
//             else{
//                 mid=s;
//             }
//         }
//         for(int j=e;j>=mid;j--){
//             if(arr[j]<=arr[mid]){
//                 e--;
//             }
//             else{
//                 mid=e;
//             }
//         }
        
//         return mid;
    }
}