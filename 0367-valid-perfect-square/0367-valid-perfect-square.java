class Solution {
    public boolean isPerfectSquare(int num) {
        
//        for(int i=1;i<=Math.sqrt(num);i++){
//            if(i*i==num){
//                return true;
//            }
//        }
        
// //         return false;
//         int i=1;
//       while(num>0){
//           num=num-i;
//           i=i+2;
//       }
//         return num==0;
        long s=1,e=num;
        while(s<=e){
            long mid=s+(e-s)/2;
            if(mid*mid==num) return true;
            else if(mid*mid<num) s=mid+1;
            else if(mid*mid>num) e=mid-1;
        }
        return false;
    }
}