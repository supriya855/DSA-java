class Solution {
    public int solve(int n,int[] dp){
        if(n<=2) return 1;
        if(dp[n]!=-1) return dp[n];
        int maxProd=Integer.MIN_VALUE;
        for(int i=1;i<n;i++){
           int pro= Math.max(i*solve(n-i,dp),i*(n-i));
            maxProd=Math.max(pro,maxProd);
        }
        return dp[n]=maxProd;
    }
    public int integerBreak(int n) {
        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);
        return solve(n,dp);
    }
    
}