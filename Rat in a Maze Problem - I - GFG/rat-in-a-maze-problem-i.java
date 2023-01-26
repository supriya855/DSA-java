//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
class Rat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[][] a = new int[n][n];
            for (int i = 0; i < n; i++)
                for (int j = 0; j < n; j++) a[i][j] = sc.nextInt();

            Solution obj = new Solution();
            ArrayList<String> res = obj.findPath(a, n);
            Collections.sort(res);
            if (res.size() > 0) {
                for (int i = 0; i < res.size(); i++)
                    System.out.print(res.get(i) + " ");
                System.out.println();
            } else {
                System.out.println(-1);
            }
        }
    }
}

// } Driver Code Ends


// User function Template for Java

// m is the given matrix and n is the order of matrix
class Solution {
    public static ArrayList<String> findPath(int[][] m, int n) {
        // Your code here
        ArrayList<String> ans= new ArrayList<>();// taking a ans of list of string to store the result
        int[][] visited = new int[n][n];// taking a visited array
        if(m[0][0]==1) solve(0,0,m,n,"",ans,visited);// calling the function only when the first element is one
        return ans;
    }
    public static void solve(int i,int j,int[][] m,int n,String move,ArrayList<String> ans,int[][] visited){
        if(i==n-1&&j==n-1){// base case when i and j reches n-1
            ans.add(move);
        }
        /* we have to write the 3 conditons while moving to left, right , down up
        1. check it is in boundary
        2.  check if it is already visited or not
        3. check if its value is 1 
        then only we can move anywhere
        */
        //DOWN
        if(i+1<n&& visited[i+1][j]==0&&m[i+1][j]==1){
            visited[i][j]=1;
            solve(i+1,j,m,n,move+'D',ans,visited);
            visited[i][j]=0;
        }
        //LEFT
        if(j-1>=0&& visited[i][j-1]==0&&m[i][j-1]==1){
             visited[i][j]=1;
            solve(i,j-1,m,n,move+"L",ans,visited);
            visited[i][j]=0;// while going back we are making visited array to 0
        }
        //RIGHT
        if(j+1<n&& visited[i][j+1]==0&&m[i][j+1]==1){
             visited[i][j]=1;
            solve(i,j+1,m,n,move+"R",ans,visited);
            visited[i][j]=0;
        }
        //UP
        if(i-1>=0&& visited[i-1][j]==0&&m[i-1][j]==1){
             visited[i][j]=1;
            solve(i-1,j,m,n,move+"U",ans,visited);
            visited[i][j]=0;
        }
    }
}