class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
      
//         return sequence(0,0,text1,text2);
//     }
//     public int sequence(int i,int j,String text1,String text2){
//         if(i==text1.length()||j==text2.length()){
//             return 0;
//         }
//         else if(text1.charAt(i)==text2.charAt(j)){
//             return 1+sequence(i+1,j+1,text1,text2);
//         }
//         else
//             return Math.max(sequence(i+1,j,text1,text2),sequence(i,j+1,text1,text2));
//                               }
        int[][] dp= new int[text1.length()+1][text2.length()+1];
        for(int i=1;i<=text1.length();i++){
            for(int j=1;j<=text2.length();j++){
                if(text1.charAt(i-1)==text2.charAt(j-1)){
                    dp[i][j]= 1+dp[i-1][j-1];
                }
                else{
                    dp[i][j]=Math.max(dp[i][j-1],dp[i-1][j]);
                }
            }
        }
            return dp[text1.length()][text2.length()];
        }
                              
}