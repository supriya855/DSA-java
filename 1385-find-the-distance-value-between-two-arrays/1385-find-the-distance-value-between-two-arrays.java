class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int c=0;
        for(int i=0;i<arr1.length;i++){
            int flag=0;
            for(int j=0;j<arr2.length;j++){
                if(Math.abs(arr1[i]-arr2[j])<=d){
                    flag=1;
                    break;
                }
                
                }
            if(flag==0) c=c+1;
            }
        
        return c;
    }
}