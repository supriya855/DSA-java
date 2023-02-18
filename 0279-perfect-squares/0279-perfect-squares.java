class Solution {
    int solve(int n,int[] dp){
        if(n<=3) return n;
        if(dp[n]!=-1) return dp[n];
        int minCount=Integer.MAX_VALUE;
        for(int i=1;i<=Math.sqrt(n);i++){
           int res= 1+solve(n-i*i,dp);// here this 1 is telling that you have considered one perfect square number
            minCount=Math.min(minCount,res);
            
        }
        return dp[n]=minCount;
    }
    
    public int numSquares(int n) {
        int[] dp= new int[n+1];
        Arrays.fill(dp,-1);
        return solve(n,dp);
    }
}