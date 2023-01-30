class Solution {
    public int tribonacci(int n) {
        int f=0;
        int s=1;
        int t=1;
        if(n<2) return n; 
        for(int i=3;i<=n;i++){
            int res=f+s+t;
            f=s;
            s=t;
            t=res;
        }
        return t;
        
    }
}