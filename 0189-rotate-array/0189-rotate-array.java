class Solution {
    public void rotate(int[] arr, int k) {
       k=k%arr.length;
        reverse(arr,0,arr.length-1);
        reverse(arr,0,k-1);
        reverse(arr,k,arr.length-1);
       
    }   
    public void reverse(int[] arr,int s,int e){
        while(s<e){
            int t=arr[s];
            arr[s]=arr[e];
            arr[e]=t;
            s++;
            e--;
        }  
    }
}
    
